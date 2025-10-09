import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int len = survey.length;
        
        /*
            survey의 첫 번째 char(c1) -> 비동의 관련 선택지 유형
                - 비동의 관련 선택지 : 1~3
            survey의 두 번째 char(c2) -> 동의 관련 선택지 유형
                - 동의 관련 선택지 : 5~7
        */
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R', 0); map.put('T', 0);
        map.put('C', 0); map.put('F', 0);
        map.put('J', 0); map.put('M', 0);
        map.put('A', 0); map.put('N', 0);
        
        for(int i=0; i<len; i++) {
            int choice = choices[i];
            int n; char c;
            
            if(choice>=1 && choice<=3) {
                n = 4-choice;
                c = survey[i].charAt(0);
                map.replace(c, map.get(c)+n);
            }
            else if(choice>=4 && choice<=7) {
                n = choice%4;
                c = survey[i].charAt(1);
                map.replace(c, map.get(c)+n);
            }
        }
        
        answer += map.get('R') >= map.get('T') ? "R" : "T";
        answer += map.get('C') >= map.get('F') ? "C" : "F";
        answer += map.get('J') >= map.get('M') ? "J" : "M";
        answer += map.get('A') >= map.get('N') ? "A" : "N";
        
        return answer;
    }
}
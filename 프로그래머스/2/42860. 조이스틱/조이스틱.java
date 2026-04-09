import java.util.*;
/*
    A~Z : 아스키코드(10진법) -> 65~90 
    위아래 : 알파벳을 바꾸는 것
    오/왼 : 커서 이동
*/
class Solution {
    public int solution(String name) {
        int answer = 0;
        int move = name.length() - 1;
        
        for(int i=0; i<name.length(); i++) {
            answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
            
            int next = i+1;
            while(next < name.length() && name.charAt(next) == 'A') {
                next++;
            }
            
            move = Math.min(move, (i*2) + name.length() - next);
            move = Math.min(move, (name.length() - next)*2+i);
        }
        answer+=move;
        
        return answer;
    }
}








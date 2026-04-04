import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // 대문자 아스키 코드값 : 65~90
        for(int i=65; i<=90; i++) {
            map.put(i, 0);
        }
        // 소문자 아스키 코드값 : 97~122
        for(int i=97; i<=122; i++) {
            map.put(i, 0);
        }

        for(char c : my_string.toCharArray()) {
            int k = (int) c;
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        
        int i = 0;
        for(Integer v : map.values()) {
            answer[i++] = v;
        }
        
        return answer;
    }
}
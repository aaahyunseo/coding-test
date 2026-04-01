import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            StringBuilder newString = new StringBuilder();
            for(int i=e; i>=s; i--) {
                newString.append(answer.charAt(i));
            }
            answer = answer.substring(0, s) + newString + answer.substring(e+1);
        }
        
        return answer;
    }
}
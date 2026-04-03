import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for(int i=e; i>=s; i--) {
            sb.append(my_string.charAt(i));
        }
        
        answer = my_string.substring(0, s) + sb.toString() + my_string.substring(e+1);
        return answer;
    }
}
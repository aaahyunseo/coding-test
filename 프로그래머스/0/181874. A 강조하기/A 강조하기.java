import java.util.*;

class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char c : myString.toCharArray()) {
            if(c=='a' || c=='A') answer += "A";
            else {
                answer += Character.toLowerCase(c);
            }
        }
        
        return answer;
    }
}
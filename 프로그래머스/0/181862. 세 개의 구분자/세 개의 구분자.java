import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("a|b|c"))
                        .filter(s -> !s.isEmpty())
                        .toArray(String[]::new);
        
        if(answer == null || answer.length == 0) return new String[] {"EMPTY"};
        return answer;
    }
}
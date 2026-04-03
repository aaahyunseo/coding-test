import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i<=my_string.length(); i++) {
            list.add(my_string.substring(0, i));
        }
        
        if(list.contains(is_prefix)) answer = 1;
        
        return answer;
    }
}
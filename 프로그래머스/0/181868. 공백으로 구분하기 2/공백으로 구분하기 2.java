import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        
        String[] arr = my_string.split(" ");
        for(String str : arr) {
            if(!str.equals("")) answer.add(str);
        }
        
        return answer.toArray(new String[0]);
    }
}
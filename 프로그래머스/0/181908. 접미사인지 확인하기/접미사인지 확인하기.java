import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        ArrayList<String> arr = new ArrayList<>();
        
        int len = my_string.length();
        for(int i=0; i<len; i++) {
            arr.add(my_string.substring(i, len));
        }
        
        if(arr.contains(is_suffix)) answer = 1;
        
        return answer;
    }
}
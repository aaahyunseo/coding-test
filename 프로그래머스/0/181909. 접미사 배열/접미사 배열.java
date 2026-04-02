import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arr = new ArrayList<>();
        
        int len = my_string.length();
        for(int i=0; i<len; i++) {
            arr.add(my_string.substring(i, len));
        }
        
        Collections.sort(arr);

        return arr.toArray(new String[0]);
    }
}
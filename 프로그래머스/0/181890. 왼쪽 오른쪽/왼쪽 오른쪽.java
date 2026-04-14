import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> answer = new ArrayList<>();
        int idx = 0;
        
        for(int i=0; i<str_list.length; i++) {
            if(str_list[i].equals("l") || str_list[i].equals("r")) {
                idx = i;
                break;
            }
        }
        
        if(str_list[idx].equals("l")) {
            for(int i=0; i<idx; i++) {
                answer.add(str_list[i]);
            }
        } else {
            for(int i=idx+1; i<str_list.length; i++) {
                answer.add(str_list[i]);
            }
        }
        
        return answer.toArray(new String[0]);
    }
}
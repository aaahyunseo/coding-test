import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();
    
        for(String str : picture) {
            StringBuilder sb = new StringBuilder();
            int cnt = 0;
            char cur = '.';
            
            for(char c : str.toCharArray()) {
                if(c == cur) cnt++;
                else {
                    for(int i=0; i<cnt*k; i++) {
                        sb.append(cur);
                    }
                    cur = c;
                    cnt = 1;
                }
            }
            
            for(int i=0; i<cnt*k; i++) {
                sb.append(cur);
            }
            
            for(int i=0; i<k; i++) {
                list.add(sb.toString());
            }
        }
        
        return list.toArray(new String[0]);
    }
}
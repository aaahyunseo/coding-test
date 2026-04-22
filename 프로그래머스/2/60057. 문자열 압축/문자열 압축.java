import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        for(int i=1; i<=s.length(); i++) {
            answer = Math.min(answer, split(s, i));
        }
        
        return answer;
    }
    
    public int split(String str, int n) {
        StringBuilder sb = new StringBuilder();
        
        String curr = str.substring(0, n);
        int cnt = 1;
        
        for(int i=n; i<str.length(); i+=n) {
            String next = str.substring(i, Math.min(i+n, str.length()));
            
            if(curr.equals(next)) {
                cnt++;
            } else {
                if(cnt > 1) sb.append(cnt).append(curr);
                else sb.append(curr);
                cnt = 1; curr = next;
            }
        }
        if(cnt > 1) sb.append(cnt).append(curr);
        else sb.append(curr);
        
        return sb.toString().length();
    }
}








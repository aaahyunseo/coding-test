import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        int len = s.length();
        
        if(len==1) return 1;
        
        for(int i=1; i<=len/2; i++) {
            StringBuffer sb = new StringBuffer();
            String prev = "";
            int cnt = 1;
            
            for(int j=0; j<=len-i; j+=i) {
                String curr = s.substring(j,j+i);
                
                if(prev.equals(curr)) {
                    cnt++;
                    continue;
                } else {
                    sb.append(cnt > 1 ? cnt+prev : prev);
                    prev = curr;
                    cnt = 1;
                }
            }
            
            sb.append(cnt > 1 ? cnt+prev : prev);
            
            if(len%i != 0) {
                sb.append(s.substring(len-len%i, len));
            }
            
            answer = Math.min(answer, sb.length());
            sb = new StringBuffer();
        }
        
        return answer;
    }
}
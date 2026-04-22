import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long max = (long) times[times.length-1] * n;
        long min = 0;
        long mid;
        long answer = 0;
        
        while(max >= min) {
            mid = (max + min) / 2;
            
            long total = 0;
            for(int t : times) {
                total += mid/t;
            }
            
            if(total < n) {
                min = mid + 1;
            } else {
                answer = mid;
                max = mid - 1;
            }
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        long min = 1;
        long max = (long) times[times.length-1] * n;
        long mid;
        long sum;
        long answer = 0;
        
        while(min <= max) {
            sum = 0;
            mid = (min + max) / 2;
            
            for(int t : times) {
                sum += mid/t;
            }
            
            if(sum >= n) {
                answer = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        
        return answer;
    }
}







import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        
        int right = distance;
        int left = 0;
        int answer = 0;
        
        while(left <= right) {
            int mid = (left + right) / 2;
            
            int prev = 0;
            int stone = 0;
            
            for(int rock : rocks) {
                if(rock - prev < mid) stone++;
                else prev = rock;
            }
            
            if(distance - prev < mid) stone++;
            
            if(stone > n) right = mid - 1;
            else {
                answer = mid;
                left = mid + 1;
            }
        }
        return answer;
    }
}
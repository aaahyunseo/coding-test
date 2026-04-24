import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        int len = citations.length;
        int max = len-1;
        int min = 0;
        int mid;
        int answer = 0;
        
        while(min <= max) {
            mid = (min + max) / 2;
            
            if(len - mid <= citations[mid]) {
                answer = len - mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        
        return answer;
    }
}
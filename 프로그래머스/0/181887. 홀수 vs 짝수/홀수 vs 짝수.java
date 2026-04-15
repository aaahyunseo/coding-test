import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int odd_sum = 0;
        for(int i=0; i<num_list.length; i+=2) {
            odd_sum += num_list[i];
        }
        
        int even_sum = 0;
        for(int i=1; i<num_list.length; i+=2) {
            even_sum += num_list[i];
        }
        
        answer = Math.max(odd_sum, even_sum);
        
        return answer;
    }
}
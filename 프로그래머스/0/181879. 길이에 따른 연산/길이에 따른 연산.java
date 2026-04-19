import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        int result = 0;
        
        if(len>=11) {
            for(int n : num_list) result += n;
        } else {
            result = 1;
            for(int n : num_list) result *= n;
        }
        
        return result;
    }
}
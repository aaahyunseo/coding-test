import java.util.*;

class Solution {
    public int solution(int[] numbers, int n) {
        int sum = 0;
        
        for(int num : numbers) {
            if(sum + num > n) return sum + num;
            else sum += num;
        }
        
        return sum;
    }
}
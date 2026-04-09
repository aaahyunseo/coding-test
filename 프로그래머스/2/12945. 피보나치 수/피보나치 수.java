import java.util.*;

class Solution {
    public int solution(int n) {
        int[] fibonachi = new int[100001];
        
        fibonachi[0] = 0;
        fibonachi[1] = 1;
        for(int i=2; i<fibonachi.length; i++) {
            fibonachi[i] = (fibonachi[i-2] + fibonachi[i-1]) % 1234567;
        }
        
        return fibonachi[n];
    }
}
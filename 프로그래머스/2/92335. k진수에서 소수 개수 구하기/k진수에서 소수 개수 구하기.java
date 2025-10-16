import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        /* k진수 변환 */
        String str = Integer.toString(n,k);
        
        String[] arr = str.split("0");
        
        for(String s : arr) {
            if(s.isEmpty()) continue;
            long num = Long.parseLong(s);
            if(isPrime(num)) answer++;
        }
        
        return answer;
    }
    
    /* 소수 판별 */
    private boolean isPrime(long num) {
        if(num < 2) return false;
        for(int i=2; i <= Math.sqrt(num); i++) {
            if(num%i == 0) return false;
        }
        return true;
    }
}
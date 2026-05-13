import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int score = 0;
        
        if(a%2 != 0 && b%2 != 0) {
            score = a*a + b*b;
        } else if(a%2 != 0 || b%2 != 0) {
            score = 2 * (a + b);
        } else {
            score = Math.abs(a-b);
        }
        
        return score;
    }
}
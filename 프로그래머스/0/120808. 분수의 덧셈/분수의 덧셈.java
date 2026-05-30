class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = denom1 * denom2 / gcd(denom1, denom2);
        
        int numer = numer1 * (lcm/denom1) + numer2 * (lcm/denom2);
        
        int gcd = gcd(numer, lcm);
        
        return new int[] {numer/gcd , lcm/gcd};
    }
    
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        double cnt = numbers.length;
        for(int n : numbers) {
            sum += n;
        }
        
        return sum/cnt;
    }
}
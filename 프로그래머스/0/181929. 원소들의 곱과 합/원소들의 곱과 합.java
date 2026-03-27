class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mul = 1;
        
        for(int n : num_list) {
            sum += n;
            mul *= n;
        }
        
        if(mul < (int)Math.pow(sum,2)) return 1;
        
        return 0;
    }
}
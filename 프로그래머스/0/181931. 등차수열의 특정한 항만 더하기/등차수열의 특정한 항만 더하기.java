class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int i = 0;
        
        for(boolean flag : included) {
            if(flag) answer += a + (d*i);
            i++;
        }
        
        return answer;
    }
}
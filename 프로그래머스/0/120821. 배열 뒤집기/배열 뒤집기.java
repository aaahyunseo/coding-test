class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len];
        
        for(int i=len; i>0; i--) {
            answer[len-i] = num_list[i-1];
        }
        
        return answer;
    }
}
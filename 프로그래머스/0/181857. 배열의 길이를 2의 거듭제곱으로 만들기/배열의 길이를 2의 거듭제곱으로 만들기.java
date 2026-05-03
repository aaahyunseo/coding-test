class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int size = 1;
        
        while(size < len) {
            size *= 2;
        }
        
        int[] answer = new int[size];
        
        for(int i=0; i<len; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}
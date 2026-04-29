import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>(Collections.nCopies(k, -1));
        
        int cnt = 0;
        for(int i=0; i<arr.length; i++) {
            if(!answer.contains(arr[i]) && cnt < k) {
                answer.set(cnt++, arr[i]);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
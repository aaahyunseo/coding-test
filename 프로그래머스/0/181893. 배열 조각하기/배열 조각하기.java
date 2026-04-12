import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> answer = new ArrayList<>();
        int start = 0;
        int end = arr.length;
        
        for(int i=0; i<query.length; i++) {
            if(i%2==0) {
                end = start + query[i];
            } else {
                start += query[i];
            }
        }
        
        for(int i=start; i<=end; i++) {
            answer.add(arr[i]);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            int min = Integer.MAX_VALUE;
            for(int i=s; i<=e; i++) {
                if(arr[i] > k && arr[i] < min) min = arr[i];
            }
            if(min == Integer.MAX_VALUE) answer.add(-1);
            else answer.add(min);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
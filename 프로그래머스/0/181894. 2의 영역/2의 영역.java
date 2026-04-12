import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int start = -1; int end = -1;
        
        for(int i=0; i<arr.length; i++) {
            if(start == -1 && arr[i]==2) start = i;
            else if(arr[i] == 2 && start != -1) end = i;
        }
        
        if(start != -1 && end != -1) {
            for(int i=start; i<=end; i++) {
                answer.add(arr[i]);
            }
        } else if(start != -1 && end == -1) {
            answer.add(arr[start]);
        } else if(answer.isEmpty()) {
            answer.add(-1);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int num : arr) {
            answer.add(num);
        }
        
        for(int i=0; i<delete_list.length; i++) {
            int cur = delete_list[i];
            if(answer.contains(cur)) {
                int idx = answer.indexOf(cur);
                answer.remove(idx);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
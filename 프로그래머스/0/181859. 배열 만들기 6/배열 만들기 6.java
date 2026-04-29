import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        int idx = 0;
        
        while(idx<arr.length) {
            if(answer == null || answer.size() == 0) {
                answer.add(arr[idx++]);
            } else {
                if(arr[idx] == answer.get(answer.size() - 1)) {
                    answer.remove(answer.size() - 1);
                    idx++;
                } else {
                    answer.add(arr[idx++]);
                }
            }
        }
        
        if(answer == null || answer.size() == 0) return new int[] {-1};
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
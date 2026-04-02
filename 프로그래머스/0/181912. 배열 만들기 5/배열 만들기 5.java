import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(String str : intStrs) {
            String idxStr = str.substring(s, s+l);
            int num = Integer.parseInt(idxStr);
            if(num > k) arr.add(num);
        }
        
        int[] answer = arr.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n : array) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        int count = 0;
        int answer = 0;
        int maxFreq = 0;
        
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                answer = e.getKey();
                count = 1;
            } else if(e.getValue() == maxFreq) count++;
        }
        
        return count > 1 ? -1 : answer;
    }
}
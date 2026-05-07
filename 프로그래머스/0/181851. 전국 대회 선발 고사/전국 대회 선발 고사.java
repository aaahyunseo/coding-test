import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(int i=0; i<rank.length; i++) {
            map.put(rank[i], i);
        }
        
        int idx = 0;
        int[] ranking = new int[3];
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int cur = entry.getValue();
            if(idx<3 && attendance[cur]) {
                ranking[idx++] = cur;
            }
        }
        
        int answer = 0;
        answer = 10000*ranking[0] + 100*ranking[1] + ranking[2];
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Map<Integer, Boolean> map = new HashMap<>();
        for(int r : reserve) {
            map.put(r, false);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int l : lost) {
            if(map.containsKey(l)) {
                map.put(l, true);
                answer++;
            } else list.add(l);
        }
        Collections.sort(list);
        
        for(int l : list) {
            if(map.containsKey(l-1) && !map.get(l-1)) {
                map.put(l-1, true);
                answer++;
            } else if(map.containsKey(l+1) && !map.get(l+1)) {
                map.put(l+1, true);
                answer++;
            }
        }
        
        return answer;
    }
}
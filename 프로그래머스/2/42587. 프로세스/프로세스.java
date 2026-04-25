import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> dq = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        int answer = 0;
        
        for(int i=0; i<priorities.length; i++) {
            dq.offer(new int[]{i, priorities[i]});
            pq.add(priorities[i]);
        }
        
        while(!dq.isEmpty()) {
            int[] cur = dq.poll();
            
            if(cur[1] == pq.peek()) {
                pq.poll();
                answer++;
                
                if(cur[0] == location) return answer;
            } else {
                dq.offerLast(cur);
            }
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n : scoville) {
            pq.offer(n);
        }
        
        int cnt = 0;
        while(pq.size() > 1) {
            if(pq.peek() >= K) return cnt;
            
            int first = pq.poll();
            int second = pq.poll();
            
            int new_scoville = first + (second*2);
            pq.offer(new_scoville);
            
            cnt++;
        }
        
        if(pq.peek() >= K) return cnt;
        return -1;
    }
}
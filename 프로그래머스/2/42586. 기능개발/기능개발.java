import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<progresses.length; i++) {
            int remain = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            q.offer(remain);
        }
        
        int cnt = 1;
        
        int cur = q.poll();
        while(!q.isEmpty()) {
            int next = q.poll();
            if(cur >= next) cnt++;
            else {
                answer.add(cnt);
                cnt = 1;
                cur = next;
            }
        }
        answer.add(cnt);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
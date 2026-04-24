import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> q = new ArrayDeque<>();
        
        for(int n : arr) {
            if(!q.isEmpty() && q.peekLast() == n) continue;
            q.offer(n);
        }
        
        return q.stream().mapToInt(Integer::intValue).toArray();
    }
}
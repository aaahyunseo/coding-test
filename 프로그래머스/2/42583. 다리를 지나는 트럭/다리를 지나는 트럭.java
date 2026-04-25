import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
        
        int time = 0;
        int sum = 0;
        
        for(int truck : truck_weights) {
            while(true) {
                if(q.isEmpty()) {
                    q.add(truck);
                    sum += truck;
                    time++;
                    break;
                }
                else if(q.size() == bridge_length) {
                    sum -= q.poll();
                } else {
                    if(sum + truck <= weight) {
                        q.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {
                        q.add(0);
                        time++;
                    }
                }
            }
        }
        
        time += bridge_length;
        
        return time;
    }
}
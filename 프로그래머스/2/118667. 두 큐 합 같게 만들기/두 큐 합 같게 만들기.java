import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        /* 두 큐의 총 합 */
        long total = 0;
        for(int i=0; i<queue1.length; i++) {
            total += (queue1[i] + queue2[i]);
        }
        
        /* 각 큐에 필요한 합 = (두 큐의 총 합)/2 */
        long point = total/2;
        
        /* 배열 -> 큐 변환 및 각 큐의 sum */
        Queue<Integer> origin = new LinkedList<>();
        Queue<Integer> comp = new LinkedList<>();
        
        long sum1 = 0; long sum2 = 0;
        
        for(int i=0; i<queue1.length; i++) {
            origin.offer(queue1[i]);
            comp.offer(queue2[i]);
            sum1 += queue1[i];
            sum2 += queue2[i];
        }
        
        /* 큐 추출 및 삽입 작업 횟수 */
        int count = 0;
        while(count <= queue1.length*3) {
            if(sum1 == point) return count;
            else if(sum1 > point) {
                int n = origin.poll();
                comp.offer(n);
                sum1 -= n;
                sum2 += n;
            }
            else if(sum1 < point) {
                int n = comp.poll();
                origin.offer(n);
                sum1 += n;
                sum2 -= n;
            }
            count++;
        }
        
        return -1;
    }
}
import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        // 출차 기준 오름차순 정렬
        Arrays.sort(routes, (a,b) -> a[1] - b[1]);
        
        int camera_cnt = 1;
        int camera_cur = routes[0][1];
        
        for(int[] route : routes) {
            int in = route[0];
            int out = route[1];
            
            if(camera_cur < in || camera_cur > out) {
                camera_cur = out;
                camera_cnt++;
            }
        }
        
        return camera_cnt;
    }
}
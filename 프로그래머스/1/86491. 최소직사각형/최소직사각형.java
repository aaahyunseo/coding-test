import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int rowMax = 0;
        int colMax = 0;
        
        for(int[] s : sizes) {
            if(s[0] < s[1]) {
                int tmp = s[0];
                s[0] = s[1];
                s[1] = tmp;
            }
            if(rowMax < s[0]) rowMax = s[0];
            if(colMax < s[1]) colMax = s[1];
        }
        
        int answer = rowMax * colMax;
        
        return answer;
    }
}
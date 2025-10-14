import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        
        int lCur = 10;  // *
        int rCur = 12;  // #
        
        for(int n : numbers) {
            if(n == 0) n = 11;
            if(n == 3 || n == 6 || n == 9) {
                answer.append("R");
                rCur = n;
            } else if(n == 1 || n == 4 || n ==7) {
                answer.append("L");
                lCur = n;
            } else {
                /*
                    오른손, 왼손 거리 계산 
                    거리 = |현재행 - 목표행| + |현재열 - 목표열|
                */
                int rDist = Math.abs((rCur-1)/3 - (n-1)/3) + Math.abs((rCur-1)%3 - (n-1)%3);
                int lDist = Math.abs((lCur-1)/3 - (n-1)/3) + Math.abs((lCur-1)%3 - (n-1)%3);
                
                if (rDist > lDist) {
                    answer.append("L");
                    lCur = n;
                }
                else if(rDist < lDist) {
                    answer.append("R");
                    rCur = n;
                }
                else {
                    if(hand.equals("right")) {
                        answer.append("R");
                        rCur = n;
                    } else {
                        answer.append("L");
                        lCur = n;
                    }
                }
            }
        }
        
        return answer.toString();
    }
}
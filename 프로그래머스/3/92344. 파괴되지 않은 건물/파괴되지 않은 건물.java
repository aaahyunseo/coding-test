// 누적합
import java.util.*;

class Solution {
    public int solution(int[][] board, int[][] skill) {
        int[][] sum = new int[board.length+1][board[0].length+1];
        
        for(int[] s : skill) {
            int n = (s[0]==1) ? -s[5] : s[5];
            
            sum[s[1]][s[2]] += n;   // 시작점
            sum[s[1]][s[4]+1] -= n; // 가로 끝점
            sum[s[3]+1][s[2]] -= n; // 세로 끝점
            sum[s[3]+1][s[4]+1] += n;   // 겹친 끝점 보정
        }
        
        // 가로 누적합
        for(int i=0; i<board.length; i++) {
            for(int j=1; j<board[0].length; j++) {
                sum[i][j] += sum[i][j-1];
            }
        }
        
        // 세로 누적합
        for(int j=0; j<board[0].length; j++) {
            for(int i=1; i<board.length; i++) {
                sum[i][j] += sum[i-1][j];
            }
        }
        
        int answer = 0;
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                board[i][j] += sum[i][j];
                if(board[i][j] > 0) answer++;
            }
        }
        
        return answer;
    }
}
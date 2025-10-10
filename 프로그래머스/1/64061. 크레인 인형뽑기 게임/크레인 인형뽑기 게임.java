import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<moves.length; i++) {
            for(int j=0; j<board.length; j++) {
                int pick = board[j][moves[i]-1];
                if(pick!=0) {
                    board[j][moves[i]-1] = 0;
                    if(!stack.isEmpty() && stack.peek() == pick) {
                        stack.pop();
                        answer += 2;
                    } else stack.push(pick);
                    break;
                }
            }
        }
        
        return answer;
    }
}
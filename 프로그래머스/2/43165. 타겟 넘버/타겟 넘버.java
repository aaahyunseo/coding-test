import java.util.*;

class Solution {
    
    static int answer;
    static int target;
    static int[] numbers;
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        
        dfs(0,0,0);
        
        return answer;
    }
    
    public void dfs(int x, int depth,int score) {
        if (depth == numbers.length) {
            if (score == target) answer++;
            return;
        } else {
            dfs(x+1, depth+1, score+numbers[x]);
            dfs(x+1, depth+1, score-numbers[x]);
        }
    }
}
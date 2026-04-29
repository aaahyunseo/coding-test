import java.util.*;

class Solution {
    int[][] dungeons;
    boolean[] visited;
    int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        visited = new boolean[dungeons.length];
        
        DFS(k, 0);
        
        return answer;
    }
    
    public void DFS(int demage, int count) {
        for(int i=0; i<dungeons.length; i++) {
            if(visited[i] || dungeons[i][0] > demage) continue;
            visited[i] = true;
            DFS(demage - dungeons[i][1], count+1);
            visited[i] = false;
        }
        
        answer = Math.max(answer, count);
    }
}
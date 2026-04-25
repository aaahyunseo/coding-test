import java.util.*;

class Solution {
    int[][] computers;
    boolean[] visited;
    int n;
    
    public int solution(int n, int[][] computers) {
        this.computers = computers;
        this.n = n;
        visited = new boolean[n];
        
        int net = 0;
        
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                DFS(i);
                net++;
            }
        }
        
        return net;
    }
    
    public void DFS(int x) {
        visited[x] = true;
        
        for(int i=0; i<n; i++) {
            if(!visited[i] && computers[i][x] == 1) DFS(i);
        }
    }
}
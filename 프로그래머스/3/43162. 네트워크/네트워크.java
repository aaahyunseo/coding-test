import java.util.*;

class Solution {
    int[][] computers;
    boolean[] visited;
    int n;
    int network = 0;
    
    public int solution(int n, int[][] computers) {
        this.computers = computers;
        this.n = n;
        visited = new boolean[n];
        
        for(int i=0; i<computers.length; i++) {
            if(!visited[i]) {
                DFS(i);
                network++;
            }
        }
        
        return network;
    }
    
    public void DFS(int net) {
        visited[net] = true;
        
        for(int i=0; i<n; i++) {
            if(computers[net][i] == 1 && computers[i][net] == 1) {
                if(!visited[i]) DFS(i);
            }
        }
    }
}






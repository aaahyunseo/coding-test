import java.util.*;

class Solution {
    public int[][] graph;
    public int n, network;
    
    public int solution(int n, int[][] wires) {
        this.n = n;
        network = n;
        
        graph = new int[n+1][n+1];
        for(int i=0; i<wires.length; i++) {
            graph[wires[i][0]][wires[i][1]] = 1;
            graph[wires[i][1]][wires[i][0]] = 1;
        }
        
        for(int i=0; i<wires.length; i++) {
            int x = wires[i][0];
            int y = wires[i][1];
            
            graph[x][y] = 0;
            graph[y][x] = 0;
            
            network = Math.min(network, BFS(x));
            
            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        
        return network;
    }
    
    public int BFS(int x) {
        boolean[] visited = new boolean[n+1];
        int cnt = 1;
        
        Queue<Integer> q = new LinkedList<>();
        visited[x] = true;
        q.add(x);
        
        while(!q.isEmpty()) {
            int cur = q.poll();
            for(int i=1; i<=n; i++) {
                if(graph[cur][i] != 1 || visited[i]) continue;
                visited[i] = true;
                q.add(i);
                cnt++;
            }
        }
        
        return (int)Math.abs(cnt - (n-cnt));
    }
}
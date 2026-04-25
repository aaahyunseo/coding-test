import java.util.*;

class Solution {
    int[][] maps;
    boolean[][] visited;
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int n, m;
    
    public class Node {
        int x, y, dist;
        
        Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
    
    public int solution(int[][] maps) {
        this.maps = maps;
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        
        return BFS(0,0);
    }
    
    public int BFS(int i, int j) {
        Deque<Node> q = new ArrayDeque<>();
        q.offer(new Node(i, j, 1));
        visited[i][j] = true;
        
        while(!q.isEmpty()) {
            Node node = q.poll();
            
            if(node.x == n-1 && node.y == m-1) return node.dist;
            
            for(int d=0; d<4; d++) {
                int nx = node.x + dx[d];
                int ny = node.y + dy[d];
                
                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(visited[nx][ny] || maps[nx][ny] != 1) continue;
                
                visited[nx][ny] = true;
                q.offer(new Node(nx, ny, node.dist+1));
            }
        }
        
        return -1;
    }
}

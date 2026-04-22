import java.util.*;

class Solution {
    int[][] maps;
    boolean[][] visited;
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int n, m;
    
    public int solution(int[][] maps) {
        this.maps = maps;
        n = maps.length;
        m = maps[0].length;
        
        visited = new boolean[n][m];
        
        return BFS(0, 0);
    }
    
    public int BFS(int x, int y) {
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{x, y, 1});
        visited[x][y] = true;
        
        while(!q.isEmpty()) {
            int[] arr = q.poll();
            int dist = arr[2];
            
            if(arr[0] == n-1 && arr[1] == m-1 && maps[arr[0]][arr[1]] == 1) return dist;
            
            for(int i=0; i<4; i++) {
                int nx = arr[0] + dx[i];
                int ny = arr[1] + dy[i];
                
                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(visited[nx][ny] || maps[nx][ny] == 0) continue;
                
                visited[nx][ny] = true;
                q.offer(new int[]{nx, ny, dist+1});
            }
        }
        
        return -1;
    }
}

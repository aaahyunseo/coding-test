import java.util.*;

class Solution {
    static int[] dx = new int[]{-1,1,0,0};
    static int[] dy = new int[]{0,0,-1,1};
    static int[][] maps;
    static boolean[][] visited;
    static int answer = -1;
    
    public int solution(int[][] maps) {
        this.maps = maps;
        visited = new boolean[maps.length][maps[0].length];
        bfs(0,0,1);
        return answer;
    }
    
    public void bfs(int x, int y, int score) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y,1});
        
        visited[x][y] = true;
        
        while(!queue.isEmpty()) {
            int[] tmp = queue.poll();
            x = tmp[0];
            y = tmp[1];
            score = tmp[2];
            
            if(x == maps.length-1 && y == maps[0].length-1) {
                answer = score;
                break;
            }
            
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx>=0 && ny>=0 && nx<maps.length && ny<maps[0].length) {
                    if(!visited[nx][ny] && maps[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny, score+1});
                    }
                }
            }
        }
    }
}
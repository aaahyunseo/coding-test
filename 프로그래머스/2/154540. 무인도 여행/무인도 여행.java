import java.util.*;

class Solution {
    int row, col;
    String[] maps;
    boolean[][] visited;
    
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    public int[] solution(String[] maps) {
        this.maps = maps;
        row = maps.length;
        col = maps[0].length();
        
        ArrayList<Integer> islands = new ArrayList<>();
        visited = new boolean[row][col];
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(!visited[i][j] && maps[i].charAt(j) != 'X') {
                    visited[i][j] = true;
                    islands.add(dfs(i, j));
                }
            }
        }
        
        if(islands.isEmpty()) islands.add(-1);
        
        Collections.sort(islands);
        return islands.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int dfs(int x, int y) {
        int sum = maps[x].charAt(y) - '0';
        
        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && nx < row && ny >= 0 && ny < col) {
                if(!visited[nx][ny] && maps[nx].charAt(ny) != 'X') {
                    visited[nx][ny] = true;
                    sum += dfs(nx, ny);
                }
            }
        }
        
        return sum;
    }
}
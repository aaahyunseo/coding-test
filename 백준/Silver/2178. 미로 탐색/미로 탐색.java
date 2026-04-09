import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0 ,0};
    static int[] dy = {0, 0, -1, 1};
    static int N, M;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        map = new int[N+1][M+1];
        visited = new boolean[N+1][M+1];
        for(int i=1; i<=N; i++) {
            String str = br.readLine();
            for(int j=1; j<=M; j++) {
                char[] c_arr = str.toCharArray();
                map[i][j] = c_arr[j-1] - '0';
            }
        }

        BFS(1,1);

        System.out.println(map[N][M]);
    }

    public static void BFS(int row, int col) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{row, col});
        visited[row][col] = true;

        while(!q.isEmpty()) {
            int[] curr = q.poll();
            
            for(int i=0; i<4; i++) {
                int nx = curr[0] + dx[i];
                int ny = curr[1] + dy[i];
                
                if(nx >= 1 && ny >= 1 && nx <= N && ny <= M) {
                    if(!visited[nx][ny] && map[nx][ny] == 1) {
                        map[nx][ny] = map[curr[0]][curr[1]] + 1;
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}

import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] visited;
    static int[][] maps;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N, total_cnt, village_cnt;
    static ArrayList<Integer> res_arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        maps = new int[N+1][N+1];
        visited = new boolean[N+1][N+1];
        total_cnt = 0;
        res_arr = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            char[] c_arr = br.readLine().toCharArray();
            for(int j=0; j<c_arr.length; j++) {
                maps[i][j] = c_arr[j] - '0';
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j] && maps[i][j] == 1) {
                    DFS(i,j);
                    total_cnt++;
                    res_arr.add(village_cnt);
                    village_cnt = 0;
                }
            }
        }

        answer.append(total_cnt);

        Collections.sort(res_arr);
        for(int i : res_arr) {
            answer.append("\n").append(i);
        }

        System.out.println(answer.toString());
    }

    public static void DFS(int x, int y) {
        visited[x][y] = true;
        village_cnt++;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny>=0 && nx<N && ny<N) {
                if(!visited[nx][ny] && maps[nx][ny] == 1) {
                    DFS(nx,ny);
                }
            }
        }
    }
}
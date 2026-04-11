import java.util.*;
import java.io.*;

public class Main {
    static int[][] map, dp;
    
    static int N;

    static final int MAX = 16_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        dp = new int[N][(1<<N)-1];

        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++) Arrays.fill(dp[i], -1);

        System.out.println(DFS(0,1));
    }

    public static int DFS(int cur, int visit) {
        if(visit == (1<<N)-1) {
            if(map[cur][0] == 0) return MAX;
            return map[cur][0];
        }

        if(dp[cur][visit] != -1) return dp[cur][visit];
        dp[cur][visit] = MAX;

        for(int i=0; i<N; i++) {
            if((visit & (1<<i)) == 0 && map[cur][i] != 0) {
                dp[cur][visit] = Math.min(DFS(i, visit | (1 << i)) + map[cur][i], dp[cur][visit]);
            }
        }

        return dp[cur][visit];
    }
}
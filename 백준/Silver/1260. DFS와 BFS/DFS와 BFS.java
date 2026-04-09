import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] visited;
    static int N, M, V;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N+1][N+1];
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1; arr[b][a] = 1;
        }

        visited = new boolean[N+1];
        DFS(V);
        System.out.println(sb.toString());

        visited = new boolean[N+1];
        sb = new StringBuilder();
        BFS(V);
        System.out.println(sb.toString());
    }

    public static void DFS(int idx) {
        visited[idx] = true;
        sb.append(idx).append(" ");

        for(int i=1; i<N+1; i++) {
            if(!visited[i] && arr[idx][i] == 1) {
                DFS(i);
            }
        }
    }

    public static void BFS(int idx) {
        Queue<Integer> q = new LinkedList<>();

        visited[idx] = true;
        q.add(idx);

        while(!q.isEmpty()) {
            int cur = q.poll();
            sb.append(cur).append(" ");
            for(int i=1; i<N+1; i++) {
                if(arr[cur][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
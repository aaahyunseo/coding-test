import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int m;
    static int v;
    static int[][] graph;
    static boolean[] visited;
    static LinkedList<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());    // 정점의 개수
        m = Integer.parseInt(st.nextToken());    // 간선의 개수
        v = Integer.parseInt(st.nextToken());    // 탐색 시작 정점 번호

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }

        DFS(v);
        sb.append("\n");
        visited = new boolean[n+1];
        BFS(v);

        System.out.println(sb);
    }

    public static void DFS(int v){
        visited[v] = true;
        sb.append(v).append(" ");

        for (int i = 0; i <= n; i++) {
            if (graph[v][i] == 1 && !visited[i]) DFS(i);
        }
    }

    public static void BFS(int v){
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            v = queue.poll();
            sb.append(v).append(" ");

            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
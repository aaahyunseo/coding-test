import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] link;
    static boolean[] visited;
    static int n, m;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        link = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            link[u][v] = 1; link[v][u] = 1;
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                BFS(i);
                count++;
            }
        }

        System.out.println(count);
    }

    public static void BFS(int st) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(st);
        visited[st] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int i = 1; i <= n; i++) {
                if (link[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
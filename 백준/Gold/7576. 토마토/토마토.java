import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m, day = 0;
    static Queue<int[]> queue = new LinkedList<>();
    static int[][] box;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        box = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        System.out.println(BFS());
    }

    public static int BFS() {
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean ripen = false;

            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();

                for (int k = 0; k < 4; k++) {
                    int nx = cur[0] + dx[k];
                    int ny = cur[1] + dy[k];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0 && !visited[nx][ny]) {
                        queue.add(new int[]{nx, ny});
                        box[nx][ny] = 1;
                        visited[nx][ny] = true;
                        ripen = true;
                    }
                }
            }
            if (ripen) day++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) return -1;
            }
        }

        return day;
    }
}
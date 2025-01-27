import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, k;
    static int[] dx = {-1, 1, 2};
    static int[] time = new int[100001];
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        if (n==k) {
            System.out.println(0);
        } else {
            BFS(n);
        }
    }

    public static void BFS(int start) {
        queue.add(start);
        time[start] = 1;

        while (!queue.isEmpty()) {
            int tmp = queue.poll();

            for (int i = 0; i < 3; i++) {
                int next;

                if (i == 2) {
                    next = tmp * dx[i];
                } else {
                    next = tmp + dx[i];
                }

                if (next == k) {
                    System.out.println(time[tmp]);
                    return;
                }

                if (next >= 0 && next < time.length && time[next] == 0) {
                    queue.add(next);
                    time[next] = time[tmp] + 1;
                }
            }
        }
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int map[][];
    static boolean visit[];
    static int count = 0;
    static int computer, network;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        computer = Integer.parseInt(br.readLine());
        network = Integer.parseInt(br.readLine());

        map = new int[computer+1][computer+1];
        visit = new boolean[computer+1];

        for (int i = 0; i < network; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;
        }

        bw.write(String.valueOf(dfs(1)));
        bw.flush();
    }

    public static int dfs(int n) {
        visit[n] = true;
        for (int i = 1; i <= computer; i++) {
            if (map[n][i] == 1 && !visit[i]) {
                count++;
                dfs(i);
            }
        }

        return count;
    }
}
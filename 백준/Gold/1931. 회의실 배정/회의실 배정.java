import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] rooms = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            rooms[i][0] = Integer.parseInt(st.nextToken());
            rooms[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(rooms, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int res = 1;
        int comp = rooms[0][1];
        for (int i = 1; i < n; i++) {
            if (rooms[i][0] >= comp) {
                comp = rooms[i][1];
                res++;
            }
        }

        bw.write(String.valueOf(res));
        bw.flush();
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] stairs = new int[301];
        for (int i = 1; i <= n; i++) {
            int score = Integer.parseInt(br.readLine());
            stairs[i] = score;
        }

        int[] sum = new int[301];
        sum[1] = stairs[1];
        sum[2] = stairs[1] + stairs[2];
        sum[3] = Math.max(stairs[1], stairs[2]) + stairs[3];
        for (int i = 4; i <= n; i++) {
            sum[i] = Math.max(sum[i-3] + stairs[i-1], sum[i-2]) + stairs[i];
        }

        bw.write(String.valueOf(sum[n]));
        bw.flush();
    }
}
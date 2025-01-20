import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static long[] dp = new long[101];
    public static void main(String[] args) throws IOException {
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(Sequence(n)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }

    public static long Sequence(int n) {
        for (int i = 6; i <= n; i++) {
            if (dp[i] == 0) {
                dp[i] = dp[i - 1] + dp[i - 5];
            }
        }
        return dp[n];
    }
}
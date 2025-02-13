import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int res1 = 0;
        for (int i = 1; i <= n; i++) {
            res1 += i;
        }
        sb.append(res1).append("\n");

        double res2 = Math.pow(res1, 2);
        sb.append((int)res2).append("\n");

        long res3 = 0;
        for (int i = 1; i <= n; i++) {
            res3 += ((long) i*i*i);
        }
        sb.append(res3).append("\n");

        System.out.println(sb.toString());
    }
}
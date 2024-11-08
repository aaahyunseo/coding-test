import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int res;

        if (k == 0 || k ==n){
            res = 1;
        } else {
            res = factorial(n) / (factorial(n-k)*factorial(k));
        }

        System.out.println(res);
    }

    private static int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            count += isPrime(num);   // 소수이면 1 반환, 소수가 아니면 0
        }
        System.out.println(count);
    }

    private static int isPrime(int num) {
        if (num < 2) return 0;
        if (num == 2) return 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
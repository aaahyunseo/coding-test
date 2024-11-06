import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(gcd(a,b));
        System.out.println((a*b)/gcd(a,b));
    }

    private static int gcd(int a, int b) {
        int n;
        while(b != 0){
            n = a % b;
            a = b;
            b = n;
        }
        return a;
    }
}
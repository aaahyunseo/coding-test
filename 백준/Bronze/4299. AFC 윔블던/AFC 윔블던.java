import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());

        if ((sum+sub)%2 != 0 || sum<sub) {
            System.out.println(-1);
        } else {
            System.out.println((sum+sub)/2 + " " +(((sum+sub)/2)-sub));
        }
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long sec = 1;

        for (int i = n; i > 0; i--) {
            sec *= i;
        }

        long week = sec / (7 * 24 * 60 * 60);
        System.out.println(week);
    }
}
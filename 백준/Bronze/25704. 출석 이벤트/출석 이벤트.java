import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        double res = 0;

        if (n<5) {
            res = p;
        } else if (n >= 5 && n < 10) {
            res = p - 500;
        } else if (n >= 10 && n < 15) {
            res = Math.min((p*0.9),(p-500));
        } else if (n >= 15 && n < 20) {
            res = Math.min((p*0.9),(p-2000));
            res = Math.min(res, p-500);
        } else if (n >= 20) {
            res = Math.min((p*0.75),(p-2000));
            res = Math.min(res, p-500);
        }

        if (res < 0) res = 0;

        System.out.println((int) res);
    }
}
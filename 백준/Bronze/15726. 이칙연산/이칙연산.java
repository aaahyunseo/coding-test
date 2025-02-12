import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a, b, c;
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Double.parseDouble(st.nextToken());
        b = Double.parseDouble(st.nextToken());
        c = Double.parseDouble(st.nextToken());

        int res1 = (int) (a * b / c);
        int res2 = (int) (a / b * c);
        System.out.println(Math.max(res1, res2));
    }
}
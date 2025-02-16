import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        int res = 0;

        while (st.hasMoreTokens()) {
            if (Integer.parseInt(st.nextToken()) == 1) {
                count++;
                res += count;
            } else count = 0;
        }

        System.out.println(res);
    }
}
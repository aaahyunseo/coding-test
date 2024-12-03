import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int s = 0;
        int t = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            s += Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            t += Integer.parseInt(st.nextToken());
        }

        System.out.println(Math.max(s, t));
    }
}
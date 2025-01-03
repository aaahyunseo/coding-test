import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int s;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            operation(str);
        }
        System.out.println(sb);
    }

    public static void operation(String str) {
        if (str.equals("all") || str.equals("empty")) {
            switch (str) {
                case "all": s = (1 << 21) - 1; break;
                case "empty": s = 0; break;
            }
        } else {
            int x = Integer.parseInt(st.nextToken());
            switch (str) {
                case "add": s |= (1<<x); break;
                case "remove": s &= ~(1<<x); break;
                case "check": sb.append((s & (1 << x)) != 0 ? 1 : 0).append("\n"); break;
                case "toggle": s ^= (1<<x); break;
            }
        }
    }
}
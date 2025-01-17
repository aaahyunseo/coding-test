import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int count = Integer.parseInt(br.readLine());
            sb.append(combinationCount(count)).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }

    public static int combinationCount(int count) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String form = st.nextToken();
            map.put(form, map.getOrDefault(form, 0) + 1);
        }

        int combination = 1;
        for (int duplicate : map.values()) {
            combination *= (duplicate + 1);
        }
        return combination - 1;
    }
}
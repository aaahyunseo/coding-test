import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> notHeard = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            notHeard.add(input);
        }

        TreeSet<String> res = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (notHeard.contains(input)) {
                res.add(input);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(res.size()).append("\n");
        for (String s : res) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);
    }
}
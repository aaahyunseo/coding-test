import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] origin = new int[n];
        int[] sorted = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            origin[i] = Integer.parseInt(st.nextToken());
            sorted[i] = origin[i];
        }
        Arrays.sort(sorted);

        HashMap<Integer, Integer> rank = new HashMap<>();
        int ranking = 0;
        for (int i = 0; i < n; i++) {
            if (!rank.containsKey(sorted[i])) {
                rank.put(sorted[i], ranking);
                ranking++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int key : origin) {
            sb.append(rank.get(key)).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
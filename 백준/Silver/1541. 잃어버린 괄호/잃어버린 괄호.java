import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static final String MINUS = "-";
    static final String PLUS = "\\+";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] arr = input.split(MINUS);

        List<Integer> list = new ArrayList<>();
        for (String s1 : arr) {
            int sum = 0;
            for (String s2 : s1.split(PLUS)) {
                sum += Integer.parseInt(s2);
            }
            list.add(sum);
        }

        int res = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            res -= list.get(i);
        }
        bw.write(String.valueOf(res));
        bw.flush();
    }
}
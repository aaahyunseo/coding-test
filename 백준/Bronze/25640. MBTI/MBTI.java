import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String jinho = br.readLine();
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String mbti = br.readLine();
            if (mbti.equals(jinho)) cnt++;
        }
        System.out.println(cnt);
    }
}
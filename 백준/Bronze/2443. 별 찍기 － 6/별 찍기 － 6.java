import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            for (int k = n; k >i; k--) {
                sb.append(' ');
            }
            for (int j = i*2-1; j > 0; j--) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
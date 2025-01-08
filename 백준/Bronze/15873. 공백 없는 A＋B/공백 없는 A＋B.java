import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int res = 0;

        if (input.length() == 2) {
            int a = Integer.parseInt(input.substring(0, 1));
            int b = Integer.parseInt(input.substring(1, 2));
            res = a + b;
        } else if (input.length() == 3) {
            if (input.charAt(1) == '0') {
                res = 10 + Integer.parseInt(input.substring(2, 3));
            } else {
                res = Integer.parseInt(input.substring(0, 1)) + 10;
            }
        } else {
            res = 20;
        }

        System.out.println(res);
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int r = 0;
        for(int i = 0 ; i < 10 ; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 1) {
                r += 90;
            } else if (input == 2) {
                r += 180;
            } else if (input == 3) {
                r -= 90;
            }
            r = (r % 360 + 360) % 360;
        }

        if (r == 0) System.out.println("N");
        else if (r == 90) System.out.println("E");
        else if (r == 180) System.out.println("S");
        else System.out.println("W");
    }
}
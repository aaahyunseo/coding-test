import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            StringBuilder sb = new StringBuilder(input);

            if (input.equals("0")) break;

            if (input.equals(sb.reverse().toString())){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String res = "";
            String input = br.readLine();

            if (input.equals("END")) break;

            for (int i = input.length()-1; i >= 0; i--) {
                res = res + input.charAt(i);
            }
            sb.append(res).append("\n");
        }

        System.out.print(sb.toString());
    }
}
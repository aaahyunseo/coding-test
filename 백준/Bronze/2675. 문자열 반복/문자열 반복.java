import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int k = 0; k < n; k++) {
            String[] str = br.readLine().split(" ");
            int repeat = Integer.parseInt(str[0]);
            String s = str[1];

            for(int i = 0; i < s.length(); i++){
                for(int j = 0; j < repeat; j++) {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
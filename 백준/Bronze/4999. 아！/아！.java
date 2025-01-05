import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String check = br.readLine();

        if (input.length() < check.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}
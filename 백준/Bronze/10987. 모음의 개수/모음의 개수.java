import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final String VOWELS = "aeiouAEIOU";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int count = 0;
        for (char c : input.toCharArray()) {
            if (VOWELS.indexOf(c) >= 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
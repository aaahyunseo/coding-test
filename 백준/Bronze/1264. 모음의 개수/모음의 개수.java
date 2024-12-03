import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static final String VOWELS = "AEIOUaeiou";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            int count = 0;
            String input = br.readLine();
            if (Objects.equals(input, "#")) break;
            for (char c : input.toCharArray()) {
                if (VOWELS.indexOf(c) != -1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
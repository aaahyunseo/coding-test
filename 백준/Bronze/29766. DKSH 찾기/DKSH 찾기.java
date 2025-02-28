import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static final String DKSH = "DKSH";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        Pattern pattern = Pattern.compile(DKSH);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println(count);
    }
}
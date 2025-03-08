import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, Boolean> mobis = new HashMap<Character, Boolean>();

        mobis.put('M', false);
        mobis.put('O', false);
        mobis.put('B', false);
        mobis.put('I', false);
        mobis.put('S', false);

        String input = br.readLine();
        for (char c : input.toCharArray()) {
            if (mobis.containsKey(c)) {
                mobis.put(c, true);
            }
        }

        boolean result = true;
        for (boolean b : mobis.values()) {
            if (!b) result = false;
        }

        if (result) System.out.println("YES");
        else System.out.println("NO");
    }
}
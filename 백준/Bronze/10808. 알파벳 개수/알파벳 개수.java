import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] alphabets = new int[26];

        for (char c : input.toCharArray()) {
            int idx = (int)c - 97;
            alphabets[idx]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : alphabets) {
            sb.append(i).append(' ');
        }

        System.out.println(sb.toString());
    }
}
import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> pokemonNameKey = new HashMap<>();
        HashMap<Integer, String> pokemonNumberKey = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            pokemonNameKey.put(input, i);
            pokemonNumberKey.put(i, input);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String quest = br.readLine();

            if (quest.chars().allMatch(Character::isDigit)) {
                sb.append(pokemonNumberKey.get(Integer.parseInt(quest))).append("\n");
            } else {
                sb.append(pokemonNameKey.get(quest)).append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
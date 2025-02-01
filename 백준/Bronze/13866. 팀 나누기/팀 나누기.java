import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] skills = new int[4];
        for (int i = 0; i < 4; i++) {
            skills[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(skills);

        System.out.println(Math.abs((skills[0] + skills[3]) - (skills[1] + skills[2])));
    }
}
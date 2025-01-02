import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(scores);

        int per = (int) Math.round(n*0.15);
        int sum = 0;
        for (int i = per; i < scores.length - per; i++) {
            sum += scores[i];
        }
        
        int res = Math.round((float) sum /(n-2*per));
        System.out.println(res);
    }
}
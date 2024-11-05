import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] numArr = new int[n];
        for (int i = 0; i < n; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(numArr);
        for (int i : numArr) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
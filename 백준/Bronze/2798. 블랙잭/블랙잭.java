import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        int[] cards = new int[num];
        StringTokenizer card = new StringTokenizer(br.readLine());

        for (int i = 0; i < num; i++) {
            cards[i] = Integer.parseInt(card.nextToken());
        }

        int result = maxSum(max, cards);
        System.out.println(result);
    }

    private static int maxSum(int max, int[] cards) {
        int sum;
        int res = 0;

        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    sum = cards[i] + cards[j] + cards[k];
                    if (sum <=max && sum > res) {
                        res = sum;
                    }
                    if (sum == max) {
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        int classNum = 0;

        if (scores[0] > scores[2]) classNum += 508*(scores[0] - scores[2]);
        else classNum += Math.abs(scores[0] - scores[2])*108;

        if (scores[1] > scores[3]) classNum += 212*(scores[1] - scores[3]);
        else classNum += Math.abs(scores[1] - scores[3])*305;

        if (scores[4] > 0) classNum += scores[4]*707;

        System.out.println(classNum*4763);
    }
}
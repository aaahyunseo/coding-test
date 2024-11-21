import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;


        int n;
        int m;

        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            LinkedList<int[]> queue = new LinkedList<>();
            for (int j=0; j<n; j++) {
                queue.add(new int[] {j, Integer.parseInt(st.nextToken())});
            }

            int count = 0;
            while(!queue.isEmpty()) {
                int[] max = queue.poll();
                boolean check = true;

                for (int j=0; j< queue.size(); j++) {
                    if (max[1]<queue.get(j)[1]) {
                        queue.add(max);

                        for (int k = 0; k < j; k++){
                            queue.add(queue.poll());
                        }
                        check = false;
                        break;
                    }
                }

                if (!check) continue;
                count++;
                if (max[0]==m) break;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int total = 0;
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int cross = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            
            if (cross == 136) total += 1000;
            else if (cross == 142) total += 5000;
            else if (cross == 148) total += 10000;
            else if (cross == 154) total += 50000;
        }

        System.out.println(total);
    }
}
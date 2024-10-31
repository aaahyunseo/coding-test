import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long v = Long.parseLong(st.nextToken());

        long meter = a - b;
        long goal = v - b;

        if(goal%meter!=0){
            System.out.println(goal/meter+1);
        }else{
            System.out.println(goal/meter);
        }
    }
}
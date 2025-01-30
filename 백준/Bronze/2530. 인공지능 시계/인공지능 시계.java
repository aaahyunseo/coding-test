import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        min += time/60;
        sec += time%60;

        min += sec/60;
        sec = sec%60;

        hour += min/60;
        min = min%60;

        hour = hour%24;

        StringBuilder sb = new StringBuilder();
        sb.append(hour).append(" ")
                .append(min).append(" ")
                .append(sec).append(" ");
        System.out.println(sb.toString());
    }
}
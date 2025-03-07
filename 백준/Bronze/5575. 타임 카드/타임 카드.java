import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int startHour, startMinute, startSecond, endHour, endMinute, endSecond;
        int h, m, s;

        for (int i = 0; i < 3; i++) {
            int time = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            startHour = Integer.parseInt(st.nextToken());
            startMinute = Integer.parseInt(st.nextToken());
            startSecond = Integer.parseInt(st.nextToken());
            endHour = Integer.parseInt(st.nextToken());
            endMinute = Integer.parseInt(st.nextToken());
            endSecond = Integer.parseInt(st.nextToken());

            time = (endHour*3600 + endMinute*60 + endSecond)
                    - (startHour*3600 + startMinute*60 + startSecond);

            h = time/3600;
            m = time%3600/60;
            s = (time%3600)%60;

            sb.append(h + " " + m + " " + s + "\n");
        }

        System.out.println(sb.toString());
    }
}
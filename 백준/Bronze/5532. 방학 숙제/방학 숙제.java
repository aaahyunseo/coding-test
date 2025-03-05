import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        int kor = Integer.parseInt(br.readLine());
        int math = Integer.parseInt(br.readLine());
        int korPerDay = Integer.parseInt(br.readLine());
        int mathPerDay = Integer.parseInt(br.readLine());

        double studyDay = Math.max((double)math/(double)mathPerDay,
                (double)kor/(double)korPerDay);
        studyDay = Math.ceil(studyDay);
        l -= (int)studyDay;

        System.out.println(l);
    }
}
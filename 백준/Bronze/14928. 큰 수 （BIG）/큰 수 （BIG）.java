import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        long res = 0;
        for (int i=0; i<n.length(); i++){
            res = (res*10 + (n.charAt(i)-'0')) % 20000303;
        }
        bw.write(String.valueOf(res));
        bw.flush();
    }
}
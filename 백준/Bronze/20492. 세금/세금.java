import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int a = (int) (n*0.78);
        int b = (int) (n - (n*0.2*0.22));
        System.out.println(a+" "+b);
    }
}
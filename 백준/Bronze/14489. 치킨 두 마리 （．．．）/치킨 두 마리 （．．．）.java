import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger a = BigInteger.valueOf(Integer.parseInt(st.nextToken()));
        BigInteger b = BigInteger.valueOf(Integer.parseInt(st.nextToken()));
        BigInteger chicken = BigInteger.valueOf(Integer.parseInt(br.readLine()));

        BigInteger sum = a.add(b);
        BigInteger price = chicken.multiply(BigInteger.valueOf(2));
        if (sum.compareTo(price) == -1) {
            System.out.println(sum);
        } else {
            System.out.println(sum.subtract(price));
        }
    }
}
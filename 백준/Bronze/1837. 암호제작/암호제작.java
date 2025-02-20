import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger P = new BigInteger(st.nextToken());
        BigInteger K = new BigInteger(st.nextToken());
        BigInteger r = new BigInteger("1");

        // 루프 변수 r을 1부터 시작하여 증가시키면서
        // P가 2 이상 K-1 이하의 숫자로 나누어지는지 확인
        while(true) {
            // r 값이 K 이상일 경우
            if (r.compareTo(K) == 1 || r.compareTo(K) == 0) {
                System.out.println("GOOD");
                break;
            }

            // r 값을 1만큼 증가시켜 다음 숫자 확인
            r = r.add(BigInteger.ONE);

            // P 를 r 로 나누어 떨어지고, r 이 K 보다 작을 경우
            if (P.remainder(r).compareTo(BigInteger.ZERO) == 0 && r.compareTo(K) == -1) {
                // r 은 P 의 작은 약수
                System.out.println("BAD " + r);
                break;
            }
        }

    }
}
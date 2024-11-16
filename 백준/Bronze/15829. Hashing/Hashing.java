import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int R = 31;           // 해시값 계산 시 기준 값
        final int M = 123456891;    // 나눗셈에서 사용할 모듈 값(해시 값이 너무 커지지 않도록 특정 범위 내로 유지)

        int n = Integer.parseInt(br.readLine());    // 문자열의 길이
        String str = br.readLine();                 // 문자열
        BigInteger res = new BigInteger("0");

        for(int i =0; i<n; i++) {
            res = res.add(BigInteger.valueOf(str.charAt(i)-96)  // 각 문자를 숫자로 변환
                    .multiply(BigInteger.valueOf(R).pow(i)));   // R값의 i 제곱과 각 문자값의 곱을 누적하여 res에 합해줌
        }
        System.out.println(res.remainder(BigInteger.valueOf(M)));   // res 값을 M으로 나누어 출력하여, 너무 큰 숫자가 생성되는 것을 방지
    }
}
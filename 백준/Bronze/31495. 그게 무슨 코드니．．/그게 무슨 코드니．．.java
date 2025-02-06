import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if (isInvalid(input)) {
            System.out.println("CE");
        } else {
            System.out.println(input.substring(1, input.length() - 1)); // 따옴표 제거 후 출력
        }
    }

    private static boolean isInvalid(String str) {
        return str == null || str.length() < 2 || !str.startsWith("\"") || !str.endsWith("\"") || str.substring(1, str.length() - 1).isEmpty();
    }
}
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        String[] strArr = new String[repeat];
        for (int i = 0; i < repeat; i++) {
            strArr[i] = br.readLine();
        }
        strArr = Arrays.stream(strArr).sorted().distinct().toArray(String[]::new);

        for(String s : lengthSortedStrArr(strArr)){
            System.out.println(s);
        }
    }

    private static String[] lengthSortedStrArr(String[] strArr) {
        Arrays.sort(strArr, (a, b) -> a.length() - b.length());
        return strArr;
    }
}
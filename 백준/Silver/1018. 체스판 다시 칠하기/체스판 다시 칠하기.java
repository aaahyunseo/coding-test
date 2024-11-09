import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static char[][] originArr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        originArr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                originArr[i][j] = str.charAt(j);
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= n-8; i++) {
            for (int j = 0; j <= m-8; j++) {
                res = Math.min(res, Math.min(whiteStart(i,j), blackStart(i,j)));
            }
        }

        System.out.println(res);
    }

    private static int whiteStart(int a, int b){
        int count = 0;
        for (int i = a; i < a+8; i++) {
            for (int j = b; j < b+8; j++) {
                if((i%2 != 0 && j%2 == 0) || (i%2 == 0 && j%2 != 0)){
                    if (originArr[i][j] == 'W') {
                        count++;
                    }
                } else {
                    if (originArr[i][j] != 'W') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private static int blackStart(int a, int b){
        int count = 0;
        for (int i = a; i < a+8; i++) {
            for (int j = b; j < b+8; j++) {
                if((i%2 != 0 && j%2 == 0) || (i%2 == 0 && j%2 != 0)){
                    if (originArr[i][j] == 'B') {
                        count++;
                    }
                } else {
                    if (originArr[i][j] != 'B') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
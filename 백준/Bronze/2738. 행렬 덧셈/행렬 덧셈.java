import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] matrixA = createMatrix(n, m);
        int[][] matrixB = createMatrix(n, m);

        System.out.println(addMatrix(n, m, matrixA, matrixB));

    }
    public static int[][] createMatrix(int n, int m) throws IOException {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return matrix;
    }

    public static String addMatrix(int n, int m, int[][] a, int[][] b) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(a[i][j] + b[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
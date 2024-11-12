import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if (binarySearch(Integer.parseInt(st.nextToken())) >= 0){
                sb.append(1).append("\n");
            } else sb.append(0).append("\n");
        }
        System.out.println(sb);
    }

    public static int binarySearch(int input) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == input) {
                return 0;
            } else if (input < arr[mid]) {
                high = mid - 1;
            } else  low = mid + 1;
        }
        return -1;
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int people = Integer.parseInt(br.readLine());

        int[] sizes = new int[6];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        // 티셔츠 묶음 단위 갯수
        int t = Integer.parseInt(st.nextToken());
        // 펜의 묶음별 갯수
        int p = Integer.parseInt(st.nextToken());

        // 주문할 티셔츠 총 묶음수
        int count = 0;
        for (int i = 0; i < 6; i++) {
            // 사이즈 별 총 필요한 묶음수
            count += sizes[i]/t;
            // 남아도 되지만 부족하면 안되기 때문에 나머지 발생 시 한 묶음 추가
            count = sizes[i]%t > 0 ? count+1 : count;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n")
                .append(people/p)   // 펜의 묶음수
                .append(" ")
                .append(people%p);  // 한 자루 단위 주문 할 갯수
        System.out.println(sb);

    }
}
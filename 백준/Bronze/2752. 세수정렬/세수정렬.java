import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            numList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(numList);
        StringBuilder sb = new StringBuilder();
        for (int i : numList) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
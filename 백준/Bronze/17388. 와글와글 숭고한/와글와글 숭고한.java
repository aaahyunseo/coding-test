import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int soongsil_univ = Integer.parseInt(st.nextToken());
        int korea_univ = Integer.parseInt(st.nextToken());
        int hanyang_univ = Integer.parseInt(st.nextToken());

        if (soongsil_univ + korea_univ + hanyang_univ<100) {
            if (soongsil_univ < korea_univ && soongsil_univ < hanyang_univ) {
                System.out.println("Soongsil");
            } else if (korea_univ < soongsil_univ && korea_univ < hanyang_univ) {
                System.out.println("Korea");
            } else if (hanyang_univ < soongsil_univ && hanyang_univ < korea_univ) {
                System.out.println("Hanyang");
            }
        } else System.out.println("OK");
    }
}
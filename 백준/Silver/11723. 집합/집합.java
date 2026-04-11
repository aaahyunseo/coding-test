import java.util.*;
import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int mask = 0;

        int m = Integer.parseInt(br.readLine());

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());

            String op = st.nextToken();
            int num = 0;
            if(!op.equals("all") && !op.equals("empty")) {
                num = Integer.parseInt(st.nextToken());
            }

            switch(op) {
                case "add":
                    mask |= (1 << num);
                    break;
                case "remove":
                    mask &= ~(1 << num);
                    break;
                case "check":
                    if((mask & (1 << num)) != 0) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "toggle":
                    if((mask & (1 << num)) != 0) mask &= ~(1 << num);
                    else mask |= (1 << num);
                    break;
                case "all" :
                    for(int s=1; s<=20; s++) {
                        mask |= (1 << s);
                    }
                    break;
                case "empty":
                    mask = 0;
            }
        }

        System.out.println(sb.toString());
    }
}
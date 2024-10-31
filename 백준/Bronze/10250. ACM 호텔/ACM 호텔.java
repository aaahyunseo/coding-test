import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());

        for(int i = 0; i < repeat; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if(num%height==0){
                System.out.println(height*100 + (num/height));
            } else{
                System.out.println((num%height)*100 + ((num/height) + 1));
            }

        }
    }
}
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int [st.countTokens()];
            for(int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int a = arr[0];
            int b = arr[1];
            int c = arr[2];

            if(c==0){
                break;
            }

            if((c*c) == (a*a + b*b)){
                System.out.println("right");
            } else{
                System.out.println("wrong");
            }
        }
    }
}
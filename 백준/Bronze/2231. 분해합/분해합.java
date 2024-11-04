import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int res = 0;
        
        for(int i=0; i<n; i++) {
            int number = i;
            int sum = 0;
            
            while(number!=0){
                sum += number%10;
                number/=10;
            }
            
            if(sum + i == n){
                res = i;
                break;
            }
        }
        
        System.out.println(res);
    }
}
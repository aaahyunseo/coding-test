import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        String str = Integer.toString(total);

        for(int i=0; i<10; i++){
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if((str.charAt(j)-'0')==i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
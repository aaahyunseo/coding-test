import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());

        for(int i=0; i<repeat; i++){
            int total = 0;
            String[] input = br.readLine().split("X");
            for(String str : input){
                for(int k=1; k<=str.length(); k++){
                    total += k;
                }
            }
            System.out.println(total);
        }
    }
}
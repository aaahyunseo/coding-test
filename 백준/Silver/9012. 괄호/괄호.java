import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for(int i = 1; i <= n; i++) {
            String str = br.readLine();
            for(int j=0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(ch =='(') {
                    stack.push(ch);
                } else{
                    if(stack.isEmpty()){
                        stack.push(ch);
                        break;
                    }
                    stack.pop();
                }
            }

            if(stack.isEmpty()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}
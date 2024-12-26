import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack;
        StringBuilder sb = new StringBuilder();

        while(true) {
            stack = new Stack<Character>();
            String str = br.readLine();
            if(str.equals(".")) break;

            boolean isValid = true;

            for(int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == '(' || c == '[') {
                    stack.push(c);
                }
                if(c == ')' || c == ']') {
                    if(stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char pop = stack.pop();
                    if ((c == ')' && pop != '(') || (c == ']' && pop != '[')) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) isValid = false;
            sb.append(isValid ? "yes" : "no").append("\n");
        }

        System.out.println(sb);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int start = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input > start) {
                for (int j = start + 1; j <= input; j++) {
                    stack.push(j);
                    sb.append('+').append("\n");
                }
                start = input;
            } else if (stack.peek() != input) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append("\n");
        }
        System.out.println(sb);
    }
}
import java.util.*;

class Solution {
    public String solution(String p) {
        if(p.isEmpty()) return "";
        
        // u, v 분리
        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();
        
        int open = 0; int close = 0;
        for(int i=0; i<p.length(); i++) {
            char c = p.charAt(i);
            u.append(c);
            if(c == '(') open++;
            else close++;
            
            if(open == close) {
                v.append(p.substring(i+1));
                break;
            }
        }
        
        if(isCorrect(u.toString())) {
            return u.toString() + solution(v.toString());
        } else {
            return "(" + solution(v.toString()) + ")" 
                + reverse(u.substring(1, u.length() - 1));
        }
    }
    
    /* 올바른 괄호 문자열 판단 */
    private boolean isCorrect(String u) {
        Stack<Character> stack = new Stack<>();
        for(char c : u.toCharArray()) {
            if(c=='(') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    
    /* 괄호 문자열 방향 뒤집기 */
    private String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            sb.append(s.charAt(i) == '(' ? ')' : '(');
        }
        return sb.toString();
    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] charArr = a.toCharArray();
        
        for(char c : charArr) {
            if(Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else {
                System.out.print(Character.toLowerCase(c));
            }
        }
    }
}
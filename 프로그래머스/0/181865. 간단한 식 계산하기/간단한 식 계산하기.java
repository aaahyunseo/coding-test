import java.util.*;

class Solution {
    public int solution(String binomial) {
        String[] strArr = binomial.split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[2]);
        String op = strArr[1];
        
        switch(op) {
            case("+"):
                return a+b;
            case("-"):
                return a-b;
            case("*"):
                return a*b;
        }
        
        return -1;
    }
}
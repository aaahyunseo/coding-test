class Solution {
    public int solution(int a, int b) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        
        int n1 = Integer.parseInt(sb1.append(str1).append(str2).toString());
        int n2 = Integer.parseInt(sb2.append(str2).append(str1).toString());
        
        if(n1>=n2) return n1;
        else return n2;
    }
}
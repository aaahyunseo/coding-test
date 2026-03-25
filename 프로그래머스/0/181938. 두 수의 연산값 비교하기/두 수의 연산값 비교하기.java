class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int answer = Integer.parseInt(sb.append(a).append(b).toString());
        
        if(answer < 2*a*b) answer = 2*a*b;
        
        return answer;
    }
}
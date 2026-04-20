class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char a = alp.charAt(0);
        
        for(char c : my_string.toCharArray()) {
            if(c == a) {
                answer += Character.toUpperCase(a);
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}
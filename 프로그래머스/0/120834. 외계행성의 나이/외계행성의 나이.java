class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        String age_str = String.valueOf(age);
        for(char num : age_str.toCharArray()) {
            char alp = (char) ((num - '0') + 'a');
            sb.append(alp);
        }
        
        return sb.toString();
    }
}
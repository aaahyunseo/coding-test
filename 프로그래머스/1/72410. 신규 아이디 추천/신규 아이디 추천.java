import java.util.*;

class Solution {    
    public String solution(String new_id) {
        String answer = "";
        
        /* 1. 소문자 치환 */
        answer = new_id.toLowerCase();
        
        /* 2. 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 제외 문자 제거 */
        answer = answer.replaceAll("[^a-z0-9._-]", "");
        
        /* 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표로 치환 */
        answer = answer.replaceAll("[.]{2,}", ".");
        
        /* 4. 마침표(.)가 처음이나 끝에 위치하면 제거 */
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        /* 5. 빈 문자열이면 a 대입 */
        if(answer.isEmpty()) answer = "a";
        
        /* 6. 아이디 길이가 15자 이하이고, 줄였을 때 맨뒤에 .이면 제거 */
        if(answer.length() >= 16) answer = answer.substring(0,15);
        answer = answer.replaceAll("[.]$", "");
        
        /* 7. 아이디 길이가 2자 이하이면 마지막 문자를 길이가 3될 때까지 반복 */
        while(answer.length() < 3) {
            answer += answer.charAt(answer.length()-1);
        }
        
        return answer;
    }
}
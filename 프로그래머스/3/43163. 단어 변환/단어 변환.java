import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        // words 배열 내 target이 없을 경우
        boolean flag = false;
        for(String word : words) {
            if(word.equals(target)) {
                flag = true;
                break;
            }
        }
        if(!flag) return answer;
        
        LinkedList<String> q = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        
        q.add(begin);
        
        while(!q.isEmpty()) {
            int size = q.size();
            
            for(int i=0; i<size; i++) {
                String curr = q.poll();
                
                if(curr.equals(target)) return answer;
                
                for(int j=0; j<words.length; j++) {
                    if(!visited[j] && chaingeCheck(curr, words[j])) {
                        visited[j] = true;
                        q.add(words[j]);
                    }
                }
            }
            answer++;
        }
        
        return answer;
    }
    
    // 서로 다른 문자가 1개일 때만 변환 가능(true)
    public boolean chaingeCheck(String s1, String s2) {
        int cnt = 0;
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) cnt++;
        }
        
        return cnt == 1;
    }
}
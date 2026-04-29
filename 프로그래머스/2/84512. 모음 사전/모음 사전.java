import java.util.*;

class Solution {
    String[] words = {"A", "E", "I", "O", "U"};
    ArrayList<String> list = new ArrayList<>();
    
    public int solution(String word) {
        int answer = 0;
        DFS("", 0);
        
        for(int i=0; i<list.size(); i++) {
            if(word.equals(list.get(i))) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
    public void DFS(String str, int depth) {
        list.add(str);
        if(depth == 5) return;
        
        for(int i=0; i<words.length; i++) {
            DFS(str+words[i], depth+1);
        }
    }
}
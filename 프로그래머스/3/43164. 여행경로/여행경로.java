// DFS(백트래킹)
import java.util.*;

class Solution {
    boolean[] checks;
    List<String> answer;
    
    public String[] solution(String[][] tickets) {
        checks = new boolean[tickets.length];
        answer = new ArrayList<>();
        
        Arrays.sort(tickets, (a,b) -> a[1].compareTo(b[1]));
        
        dfs(0, "ICN", tickets);
        
        return answer.toArray(new String[0]);
    }
    
    public boolean dfs(int idx, String start, String[][] tickets) {
        answer.add(start);
        
        if(idx == tickets.length) return true;
        
        for(int i=0; i<tickets.length; i++) {
            if(!checks[i] && tickets[i][0].equals(start)) {
                checks[i] = true;
                if(dfs(idx+1, tickets[i][1], tickets)) return true;
                checks[i] = false;
            }
        }
        
        answer.remove(answer.size() - 1);
        return false;
    }
}







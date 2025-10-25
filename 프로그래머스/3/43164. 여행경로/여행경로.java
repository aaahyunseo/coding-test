import java.util.*;

class Solution {
    static String[][] tickets;
    static boolean[] visited;
    static ArrayList<String> answer = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        this.tickets = tickets;
        
        dfs(0, "ICN", "ICN");
        Collections.sort(answer);
        
        return answer.get(0).split(",");
    }
    
    public void dfs(int depth, String start, String path) {
        if (depth == tickets.length) {
            answer.add(path);
            return;
        }
        
        for (int j=0; j<tickets.length; j++) {
            if(!visited[j] && tickets[j][0].equals(start)) {
                visited[j] = true;
                dfs(depth+1, tickets[j][1], path + "," + tickets[j][1]);
                visited[j] = false;
            }
        }
    }
}
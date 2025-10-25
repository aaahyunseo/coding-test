class Solution {
    static int[][] computers;
    static boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        this.computers = computers;
        visited = new boolean[n];
        
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                answer++;
                dfs(i);
            }
        }
        
        return answer;
    }
    
    public void dfs(int i) {
        visited[i] = true;
        
        for(int j=0; j<computers.length; j++) {
            if(!visited[j] && computers[i][j] == 1) dfs(j);
        }
    }
}
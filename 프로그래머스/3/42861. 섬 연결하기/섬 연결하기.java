import java.util.*;

class Solution {
    int[] parent;
    
    public int find(int x) {
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    
    public void union(int a, int b) {
        if(find(a) != find(b)) {
            parent[find(b)] = find(a);
        }
    }
    
    public int solution(int n, int[][] costs) {
        Arrays.sort(costs, (a,b) -> a[2] - b[2]);
        
        parent = new int[n];
        for(int i=0; i<n; i++) {
            parent[i] = i;
        }
        
        int answer = 0;
        for(int[] c : costs) {
            int a = c[0];
            int b = c[1];
            
            if(find(a) != find(b)) {
                union(a,b);
                answer += c[2];
            }
        }
        
        return answer;
    }
}
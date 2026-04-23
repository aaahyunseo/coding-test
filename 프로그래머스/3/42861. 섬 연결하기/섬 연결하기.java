import java.util.*;

class Solution {
    int[] parent;
    
    public void union(int a, int b) {
        int root_a = find(a);
        int root_b = find(b);
        
        if(root_a != root_b) {
            parent[root_b] = root_a;
        }
    }
    
    public int find(int x) {
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
        Arrays.sort(costs, (a,b) -> a[2] - b[2]);
        
        parent = new int[n];
        for(int i=0; i<n; i++) {
            parent[i] = i;
        }
        
        for(int[] c : costs) {
            int a = c[0];
            int b = c[1];
            
            if(find(a) != find(b)) {
                union(a, b);
                answer += c[2];
            }
        }
        
        return answer;
    }
}






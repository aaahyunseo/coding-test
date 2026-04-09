class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] map = new int[m+1][n+1];
        
        // 물이 잠긴 지역
        for(int[] puddle : puddles) {
            map[puddle[0]][puddle[1]] = -1;
        }
        
        map[1][1] = 1;
        for(int i=1; i<m+1; i++) {
            for(int j=1; j<n+1; j++) {
                if((i==1 && j==1)) continue;
                if(map[i][j] == -1) {
                    map[i][j] = 0;
                    continue;
                }
                map[i][j] = (map[i][j-1] + map[i-1][j]) % 1000000007;
            }
        }
        
        return map[m][n];
    }
}
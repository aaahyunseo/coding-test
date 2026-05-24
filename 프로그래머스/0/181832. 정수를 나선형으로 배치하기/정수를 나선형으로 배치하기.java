class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int num = 1;
        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = n-1;
        
        while(num <= n*n) {
            for(int i=col_start; i<=col_end; i++) {
                answer[row_start][i] = num++;
            }
            row_start++;
            
            for(int i=row_start; i<=row_end; i++) {
                answer[i][col_end] = num++;
            }
            col_end--;
            
            for(int i=col_end; i>=col_start; i--) {
                answer[row_end][i] = num++;
            }
            row_end--;
            
            for(int i=row_end; i>=row_start; i--) {
                answer[i][col_start] = num++;
            }
            col_start++;
        }
        
        return answer;
    }
}
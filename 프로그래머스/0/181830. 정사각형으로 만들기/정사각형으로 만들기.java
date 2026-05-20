class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        
        if(row != col) {
            int[][] new_arr;
            if(row > col) new_arr = new int[row][row];
            else new_arr = new int[col][col];
            
            for(int i=0; i<row; i++) {
                for(int j=0; j<col; j++) {
                    new_arr[i][j] = arr[i][j];
                }
            }
            
            return new_arr;
        }
        
        return arr;
    }
}
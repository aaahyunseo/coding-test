import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        
        for(int c=0; c<len; c++) {
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];
            
            ArrayList<Integer> arr = new ArrayList<>();
            for(int n=i-1; n<j; n++) {
                arr.add(array[n]);
            }
            Collections.sort(arr);
            
            answer[c] = arr.get(k-1);
        }
        
        return answer;
    }
}
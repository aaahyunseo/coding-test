import java.util.*;

class Solution {
    public int solution(int[] arr) {
        boolean flag = true;
        int answer = 0;
        
        while(flag) {
            int[] tmp = Arrays.copyOf(arr, arr.length);
            
            for(int i=0; i<arr.length; i++) {
                if(arr[i]>=50 && arr[i]%2==0) {
                    arr[i] = arr[i] / 2;
                } else if(arr[i]<50 && arr[i]%2!=0) {
                    arr[i] = arr[i]*2 + 1;
                }
            }
            
            if(Arrays.equals(tmp, arr)) flag = false;
            else answer++;
        }
        
        return answer;
    }
}
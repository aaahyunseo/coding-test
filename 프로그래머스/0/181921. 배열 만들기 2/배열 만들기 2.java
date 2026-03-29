import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=l; i<=r; i++) {
            String num = String.valueOf(i);
            boolean flag = true;
            for(char c : num.toCharArray()) {
                if(c!='0' && c!='5') flag = false;
            }
            if(flag) answer.add(i);
        }
        
        if(answer.isEmpty()) answer.add(-1);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
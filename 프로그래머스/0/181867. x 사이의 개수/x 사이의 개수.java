import java.util.*;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        
        String[] str = myString.split("x", -1);
        for(String s : str) {
            list.add(s.length());
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
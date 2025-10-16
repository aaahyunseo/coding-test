import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        s = s.substring(2, s.length()-2);
        String[] arrs = s.split("\\},\\{");
        
        Arrays.sort(arrs, Comparator.comparingInt(String::length));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String arr : arrs) {
            String[] numbers = arr.split(",");
            for(String num : numbers) {
                int n = Integer.parseInt(num);
                if(!list.contains(n)) list.add(n);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
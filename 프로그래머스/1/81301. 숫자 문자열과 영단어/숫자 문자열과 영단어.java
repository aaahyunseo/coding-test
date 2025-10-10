import java.util.*;

class Solution {
    public int solution(String s) {
        HashMap<String, String> dictionary = new HashMap<>();
        
        dictionary.put("zero", "0");
        dictionary.put("one", "1");
        dictionary.put("two", "2");
        dictionary.put("three", "3");
        dictionary.put("four", "4");
        dictionary.put("five", "5");
        dictionary.put("six", "6");
        dictionary.put("seven", "7");
        dictionary.put("eight", "8");
        dictionary.put("nine", "9");
        
        for(String key : dictionary.keySet()) {
            s = s.replaceAll(key, dictionary.get(key));
        }
        int answer = Integer.parseInt(s);
        
        return answer;
    }
}
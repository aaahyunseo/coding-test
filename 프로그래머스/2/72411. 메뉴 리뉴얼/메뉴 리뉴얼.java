import java.util.*;

class Solution {
    static HashMap<String, Integer> map;
    
    public String[] solution(String[] orders, int[] course) {
        ArrayList<String> answer = new ArrayList<>();
        
        for(int c : course) {
            map = new HashMap<>();
            int max = 0;
            
            for(String order : orders) {
                char[] arr = order.toCharArray();
                Arrays.sort(arr);
                
                // 메뉴리스트, 현재 조합, 현재 길이, 원하는 코스 길이
                dfs(arr,"",0,0,c);
            }
            
            for(String key : map.keySet()) {
                int count = map.get(key);
                
                if(count >= 2) {
                    max = Math.max(max, count);
                }
            }
            
            for(String key : map.keySet()) {
                if(map.get(key) == max && max >=2) {
                    answer.add(key);
                }
            }
        }
        
        Collections.sort(answer);
        return answer.toArray(new String[0]);
    }
    
    public void dfs(char[] arr, String str, int idx, int depth, int target) {
        if(depth == target) {
            map.put(str, map.getOrDefault(str, 0) + 1);
            return;
        }
        
        for(int i=idx; i<arr.length; i++) {
            dfs(arr, str+arr[i], i+1, depth+1, target);
        }
    }
}
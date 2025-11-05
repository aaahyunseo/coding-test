import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        // 가능한 모든 조합의 수
        int answer = 1;
        
        // 종류별 의상의 갯수
        Map<String, Integer> map = new HashMap<>();
        for(String[] c : clothes) {
            map.put(c[1], map.getOrDefault(c[1], 0) + 1);
        }
        
        for(int cnt : map.values()) {
            answer *= (cnt+1);
        }
        
        // 모두 안입은 경우 1 빼고 결과 반환
        return answer - 1;
    }
}
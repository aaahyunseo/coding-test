import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        /* 유저별 신고 횟수 카운팅 */
        Map<String, Integer> count_map = new HashMap<>();
        for(String str : id_list) {
            count_map.put(str, 0);
        }
        
        /* 유저별 신고 유저 리스트 매핑 (중복 제거) */
        Map<String, Set<String>> report_map = new HashMap<>();
        for(String str : report) {
            String[] arr = str.split(" ");
            String a = arr[0];
            String b = arr[1];
            report_map.computeIfAbsent(a, key -> new HashSet<>()).add(b);
        }
        
        /* 유저 신고 내역 카운팅 */
        for(Map.Entry<String, Set<String>> entry : report_map.entrySet()) {
            for(String s : entry.getValue()) {
                count_map.put(s, count_map.get(s) + 1);
            }
        }
        
        /* 유저별 메일 전송 횟수 카운팅 */
        for(int i=0; i<id_list.length; i++) {
            Set<String> set = report_map.get(id_list[i]);
            if(set != null) {
                for(String s : set) {
                    if(count_map.get(s) >= k) answer[i]++;
                }
            }
        }
        
        return answer;
    }
}
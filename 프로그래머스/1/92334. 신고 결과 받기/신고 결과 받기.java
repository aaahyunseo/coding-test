import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        /* 유저 ID와 신고한 ID를 저장*/
        HashMap<String, ArrayList<String>> users = new HashMap<>();
        for(String id : id_list) {
            users.put(id, new ArrayList<>());
        }
        
        /* 신고 당한 유저 ID와 횟수를 저장*/
        HashMap<String, Integer> counts = new HashMap<>();
        
        for(String str : report) {
            String[] strSplit = str.split(" ");
            String reporter = strSplit[0];
            String reported = strSplit[1];
            
            if(!users.get(reporter).contains(reported)) {
                users.get(reporter).add(reported);
                counts.compute(reported, (key, value) -> value == null ? 1 : value+1);   
            }
        }
        
        /* 정지된 ID를 저장할 배열 */
        ArrayList<String> reportedUsers = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            
            if(value >= k) reportedUsers.add(key);
        }
        
        int idx = 0;
        /* 유저별 처리 결과 메일 횟수 계산 */
        for(String id : id_list) {
            int count = 0;
            for(String user : reportedUsers) {
                if(users.get(id).contains(user)) count++;
            }
            answer[idx++] = count;
        }
        
        return answer;
    }
}
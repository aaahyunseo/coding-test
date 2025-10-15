import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        
        /* 유저 아이디와 닉네임을 저장할 Map */
        HashMap<String, String> idAndNick = new HashMap<>();
        /* 유저 아이디와 기록을 저장할 2차원 배열 */
        String[][] idAndRecord = new String[record.length][2];
        
        for(int i=0; i<record.length; i++) {
            String[] strArr = record[i].split(" ");
            String rec = strArr[0];
            String id = strArr[1];
            
            if(rec.equals("Enter") || rec.equals("Change")) {
                String nick = strArr[2];
                idAndNick.put(id, nick);
            }
            
            idAndRecord[i][0] = id;
            idAndRecord[i][1] = rec;
        }
        
        ArrayList<String> answer = new ArrayList<>();
        for(String[] r : idAndRecord) {
            String nick = idAndNick.get(r[0]);
            String rec = r[1];
            
            if(rec.equals("Enter")) {
                answer.add(nick+"님이 들어왔습니다.");
            } else if(rec.equals("Leave")) {
                answer.add(nick+"님이 나갔습니다.");
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}
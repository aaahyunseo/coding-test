import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> result = new ArrayList<>();
        int todayDate = toDays(today);
        
        /*
            terms 약관 정보를 HashMap에 저장
            - key는 약관 이름, value는 약관 기간
        */
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : terms) {
            String[] splitStr = str.split(" ");
            map.put(splitStr[0], Integer.parseInt(splitStr[1]));
        }
        
        /*
            오늘 날짜와 해당 약관 기간 비교하기
        */
        for(int i=0; i<privacies.length; i++) {
            String[] str = privacies[i].split(" ");
            int startDate = toDays(str[0]);
            int tosDays = map.get(str[1])*28;
            
            if(todayDate >= startDate+tosDays) result.add(i+1);
        }
        
        Collections.sort(result);
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) answer[i] = result.get(i);
        return answer;
    }
    
    private int toDays(String date) {
        String[] str = date.split("\\.");
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        return (12*year + month)*28 + day;
    }
}
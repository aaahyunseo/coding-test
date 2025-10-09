import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int len = friends.length;
        
        /*
            친구 이름과 인덱스를 Map 형태로 저장
        */
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++) {
            map.put(friends[i], i);
        }
        
        /*
            giftDiff : 선물 지수,
            giftCount : 선물 주고 받은 갯수
        */
        int[] giftDiff = new int[len];
        int[][] giftCount = new int[len][len];
        
        /*
            a : 선물 준 사람(friend[0])의 인덱스 , b : 선물 받은 사람(friend[1])의 인덱스
            1. giftCount[a][b]++
            2. a의 선물 지수 +1, b의 선물 지수 -1
        */
        for(int i=0; i<gifts.length; i++) {
            String[] friend = gifts[i].split(" ");
            int a = map.get(friend[0]);
            int b = map.get(friend[1]);
            
            giftDiff[a]++;
            giftDiff[b]--;
            
            giftCount[a][b] += 1;
        }
        
        /*
            answer 값 구하기
        */
        for(int i=0; i<len; i++) {
            int sum = 0;
            
            for(int j=0; j<len; j++) {
                if(i==j) continue;
                if(giftCount[i][j] == giftCount[j][i]) {
                    if(giftDiff[i] > giftDiff[j]) sum++;
                } else if(giftCount[i][j] > giftCount[j][i]) sum++;
            }
            
            if(sum > answer) answer = sum;
        }
        
        return answer;
    }
}
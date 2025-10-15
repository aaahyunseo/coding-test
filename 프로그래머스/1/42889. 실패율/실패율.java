import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        /* 각 스테이지 별 실패율 */
        Map<Integer, Double> failureRates = new HashMap<>();
        for(int i=0; i<N; i++) {
            int failure = 0;
            int challenger = 0;
            for(int s : stages) {
                if(s >= i+1) challenger++;
                if(s == i+1) failure++;
            }
            failureRates.put(i+1, challenger == 0 ? 0.0 : (double) failure/challenger );
        }
        
        /* 실패율에 따른 스테이지 내림차순 정렬 */
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(failureRates.entrySet());
        Collections.sort(list, (e1, e2) -> {
            int cmp = e2.getValue().compareTo(e1.getValue());
            if (cmp == 0) {
                return e1.getKey().compareTo(e2.getKey());
            }
            return cmp;
        });
        
        int idx = 0;
        for (Map.Entry<Integer, Double> m : list) {
            answer[idx++] = m.getKey();
        }
        
        return answer;
    }
}
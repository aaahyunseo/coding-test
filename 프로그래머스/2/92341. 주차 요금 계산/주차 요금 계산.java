import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        /* 기본시간(분), 기본요금(원), 단위시간(분), 단위요금(원) 변수 선언*/
        int defaultTime = fees[0];
        int basicRate = fees[1];
        int unitTime = fees[2];
        int unitCharge = fees[3];
        
        /* 차량별 입차 기록 */
        Map<String, String> carRec = new HashMap<>();
        
        /* 차량별 누적 시간 */
        TreeMap<String, Integer> charges = new TreeMap<>();
        
        /* 입차/출차 처리 로직 */
        for(String r : records) {
            String[] str = r.split(" ");
            String time = str[0];
            String car = str[1];
            String record = str[2];
            
            if(record.equals("IN")) {
                carRec.put(car,time);
            } else if(record.equals("OUT")) {
                int diffTime = getDiffTime(carRec.get(car), time);
                charges.put(car, charges.getOrDefault(car, 0) + diffTime);
                carRec.remove(car);
            }
        }
        
        /* 입차 기록만 있고, 출차 기록이 없는 차량 */
        if(!carRec.isEmpty()) {
            for(String k : carRec.keySet()) {
                int diffTime = getDiffTime(carRec.get(k), "23:59");
                charges.put(k, charges.getOrDefault(k, 0) + diffTime);
            }
        }
        
        /* 요금 계산 */
        ArrayList<Integer> answer = new ArrayList<>();
        for(Integer v : charges.values()) {
            int pay = basicRate;
            if(v > defaultTime) {
                int plus = (int) Math.ceil((v - defaultTime) / (double) unitTime);
                pay += plus*unitCharge;
            }
            answer.add(pay);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    /* 시간 차이 계산 로직 */
    private int getDiffTime(String inTime, String outTime) {
        String[] t1 = inTime.split(":");
        int in = Integer.parseInt(t1[0])*60 + Integer.parseInt(t1[1]);
        
        String[] t2 = outTime.split(":");
        int out = Integer.parseInt(t2[0])*60 + Integer.parseInt(t2[1]);
        
        return out - in;
    }
}
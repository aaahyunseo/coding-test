import java.util.*;

class Solution {
    class Car {
        int number, start_time, total_time;
        boolean status;
        
        Car(int number, int start_time, int total_time, boolean status) {
            this.number = number;
            this.start_time = start_time;
            this.total_time = total_time;
            this.status = status;
        }
    }
    
    public int[] solution(int[] fees, String[] records) {
        int default_min = fees[0];
        int default_fee = fees[1];
        int unit_min = fees[2];
        int unit_fee = fees[3];
        
        Map<Integer, Car> map = new TreeMap<>();
        
        for(String record : records) {
            String[] rec_arr = record.split(" ");
            String[] time = rec_arr[0].split(":");
            int hour = Integer.parseInt(time[0]);
            int min = Integer.parseInt(time[1]);
            int num = Integer.parseInt(rec_arr[1]);
            String status = rec_arr[2];
            
            Car car = map.computeIfAbsent(num, k -> new Car(num, 0, 0, false));
            
            if(status.equals("IN")) {
                car.start_time = hour*60 + min;
                car.status = true;
            } else {
                // 주차 누적 시간
                int end_time = hour*60 + min;
                int total = end_time - car.start_time;
                car.total_time += total;
                car.status = false;
            }
        }
        
        for(Car car : map.values()) {
            // 아직 출차 처리 되지 않았을 경우
            if(car.status) {
                int end_time = 23*60 + 59;
                
                // 주차 누적 시간
                int total = end_time - car.start_time;
                car.total_time += total;
                
                car.status = false;
            }
        }
        
        // 차량별 요금 정산
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(Car car : map.values()) {
            if(car.total_time <= default_min) answer.add(default_fee);
            else {
                int plus = (int) Math.ceil((double)(car.total_time - default_min) / unit_min) * unit_fee;
                answer.add(default_fee + plus);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}


import java.util.*;

class Solution {
    int[] answer = new int[2];
    int[] rates = {10, 20, 30, 40};
    static int maxSubscribers;
    static int maxProfit;
    
    public int[] solution(int[][] users, int[] emoticons) {
        check(0, emoticons.length, new int[emoticons.length], users, emoticons);
        answer[0] = maxSubscribers;
        answer[1] = maxProfit;
        return answer;
    }
    
    private void check(int idx, int emoticonsLen, int[] discounts, int[][] users, int[] emoticons) {
        if(idx == emoticonsLen) {
            int join = 0;
            int cost = 0;
            
            for(int[] user : users) {
                int userRate = user[0];
                int userPrice = user[1];
                
                int sum = 0;
                
                for(int i=0; i<emoticons.length; i++) {
                    if(discounts[i]>=userRate) {
                        sum += emoticons[i]/100*(100-discounts[i]);
                    }
                }
                
                if(sum >= userPrice) join++;
                else cost += sum;
                
                if (join > maxSubscribers) {
                    maxSubscribers = join;
                    maxProfit = cost;
                } else if (join == maxSubscribers) {
                    maxProfit = Math.max(maxProfit, cost);
                }
            }
            return;
        }
        
        for(int i=0; i<4; i++) {
            discounts[idx] = rates[i];
            check(idx+1, emoticonsLen, discounts, users, emoticons);
        }
    }
}
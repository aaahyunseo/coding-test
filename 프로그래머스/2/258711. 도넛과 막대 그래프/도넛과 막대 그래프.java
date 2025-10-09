import java.util.*;

class Solution {
    public int[] solution(int[][] edges) {
        int[] answer = new int[4];
        
        int maxNode = 0;
        for(int[] edge : edges) {
            maxNode = Math.max(maxNode, Math.max(edge[0], edge[1]));
        }
        
        int[] input = new int[maxNode + 1];
        int[] output = new int[maxNode + 1];
        
        for (int[] edge : edges) {
            input[edge[1]]++;
            output[edge[0]]++;
        }
        
        /*
        - 생성 정점 : in = 0 / out ≥2
        - 막대 그래프 : in = 1 / out = 0
        - 8자 그래프 : in ≥2 / out ≥2
        - 도넛 그래프 : in ≥1 / out ≥1 (도넛은 생성점, 막대, 8자 제외한 나머지)
        */
        for(int i=0; i<=maxNode; i++) {
            if(input[i] == 0 && output[i] >= 2) answer[0] = i;      // 생성 정점
            else if(input[i] > 0 && output[i] == 0) answer[2]++;    // 막대
            else if(input[i] >= 2 && output[i] >= 2) answer[3]++;   // 8자
        }
        answer[1] = output[answer[0]] - (answer[2] + answer[3]);    // 도넛
        
        return answer;
    }
}
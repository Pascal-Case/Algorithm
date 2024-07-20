import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length; i++) {
            int a = score[i][0] + score[i][1];
            int rank = 1;
            for(int j = 0; j < score.length; j++) {
                if(i == j) continue;
                
                int b = score[j][0] + score[j][1];
                
                if(a < b) rank++;
            
            }
            answer[i] = rank;
        }
    
        return answer;
    }
}
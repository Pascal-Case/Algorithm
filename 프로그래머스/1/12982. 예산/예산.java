import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        
        for(int i : d) {
            if(budget - i >= 0) {
                answer++;
                budget -= i;
            }
        }
        
        return answer;
    }
}
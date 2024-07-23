import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int e : emergency) {
            pq.add(e);
        }
    
        
        for(int i = 0; i < emergency.length; i++) {
            int num = pq.poll();
            for(int j = 0; j < emergency.length; j++) {
                if(num == emergency[j]) answer[j] = i + 1;
            }
        }
        
        return answer;
    }
}
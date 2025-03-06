import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();   
        int answer = 0;
        
        for(int s : scoville) {
            pq.add(s);
        }
        
        while(pq.peek() < K) {
            
            if(pq.size() == 1 && pq.peek() < K) return -1;
            
            pq.add(newScoville(pq.poll(), pq.poll()));
            answer++;
        }
        
        return answer;
    }
    
    public static int newScoville(int a, int b) {
        return Math.min(a, b) + (Math.max(a, b) * 2);
    }
}
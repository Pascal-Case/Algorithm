import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(deque.isEmpty()) deque.addLast(arr[i]);
            else {
                if(deque.peekLast() == arr[i]) {
                    deque.pollLast();
                } else {
                    deque.addLast(arr[i]);
                }
            }
        }
        
        int[] answer = new int[deque.size()];
        int idx= 0 ;
        for(int n : deque) {
            answer[idx++] = deque.pollFirst();
        }
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
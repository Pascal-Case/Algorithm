import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();
        int i = 0;
        
        while(i < arr.length) {
            if(stk.isEmpty()) {
                stk.offerLast(arr[i]);
                i++;
            } else {
                if(arr[i] > stk.peekLast()) {
                    stk.offerLast(arr[i]);
                    i++;
                } else {
                    stk.removeLast();   
                }
                
            }
        }
        
        return stk.stream().mapToInt(n -> n).toArray();
    }
}
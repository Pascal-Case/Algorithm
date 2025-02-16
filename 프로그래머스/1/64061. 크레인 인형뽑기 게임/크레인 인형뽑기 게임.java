import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        // 
        
        Deque<Integer> deque = new LinkedList<>();
        int answer = 0;
        
        for(int move : moves) {
            int target = -1;
            
            for(int i = 0; i < board[move-1].length; i++) {
                if(board[i][move-1] != 0) {
                    target = board[i][move-1];
                    board[i][move-1] = 0;
                    break;
                }
            }
            
            if(target != -1) {
                if(deque.size() > 0 && deque.peekFirst() == target) {
                    deque.pollFirst();
                    answer += 2;
                } else {
                    deque.addFirst(target);
                }
                
            }
            
            
        }
        
        return answer;
    }
}
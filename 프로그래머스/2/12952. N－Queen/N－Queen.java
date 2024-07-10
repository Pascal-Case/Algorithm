class Solution {
    private static int[] board;
    private static int answer = 0;
    
    public int solution(int n) {
        board = new int[n];
        
        backTracking(0, n);
        
        return answer;
    }
    
    public void backTracking(int depth, int n) {
        if(depth == n) {
            answer ++;
            return;
        }
        
        for(int i = 0; i < n; i++) {
            board[depth] = i;
            if(possible(depth)) {
                backTracking(depth + 1, n);
            }
        }
    }
    
    public boolean possible(int depth) {
        
        for(int i = 0; i < depth; i++) {
            if(board[i] == board[depth]) {
                return false;
            }
            
            if(Math.abs(depth - i) == Math.abs(board[depth] - board[i])) {
                return false;
            }
        }
        return true;
    }
    
}
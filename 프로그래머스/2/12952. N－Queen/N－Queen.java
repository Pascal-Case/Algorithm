class Solution {
    private static int[] board;
    private static int cnt = 0;
    
    public int solution(int n) {
        board = new int[n];
        
        backTracking(0, n);
        
        return cnt;
    }
    
    public void backTracking(int row, int n) {
        if(row == n) {
            cnt++;
            return;
        }
        
        for(int i = 0; i < n; i++) {
            board[row] = i;
            
            if(isPromising(row)) {
                backTracking(row + 1, n);
            }
        }
    }
    
    public boolean isPromising(int row) {
        
        for(int i = 0; i < row; i++) {
            
            if(board[i] == board[row]) return false;
            
            if(Math.abs(row - i) == Math.abs(board[row] - board[i])) return false;
            
        }
        return true;
    }
    
    
}
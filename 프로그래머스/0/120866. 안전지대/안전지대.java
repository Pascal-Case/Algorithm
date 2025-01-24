class Solution {
    public int solution(int[][] board) {
        int[][] safe = new int[board.length][board.length];
        int answer = 0;
        
        int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                if(board[i][j] == 1) {
                    safe[i][j] = 1;
                    for(int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        
                        if(nx >= 0 && nx < board.length && ny >= 0 && ny < board.length) {
                            safe[nx][ny] = 1;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < safe.length; i++) {
            for(int j = 0; j < safe.length; j++) {
                if(safe[i][j] == 0) answer++;
            }
        }
        return answer;
    }
}
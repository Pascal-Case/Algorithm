class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int[] dot = dots[0];
        int x = 1;
        int y = 1;
        for(int i = 1; i < 4; i++) {
            if(dot[0] == dots[i][0]) y = Math.abs(dots[i][1] - dot[1]);
            if(dot[1] == dots[i][1]) x = Math.abs(dots[i][0] - dot[0]);
        }
        
        return x * y;
    }
}
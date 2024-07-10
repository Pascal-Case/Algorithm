class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int[] dot1 = dots[0];
        int[] dot2 = dots[1];
        int[] dot3 = dots[2];
        int[] dot4 = dots[3];
        
        if(func(dot1, dot2) == func(dot3, dot4) 
           || func(dot1, dot3) == func(dot2, dot4) 
           || func(dot1, dot4) == func(dot2, dot3) 
          ) {
            return 1;
        } else {
            return 0;
        }

    }
    
    public double func(int[] dot1, int[] dot2) {
        return (dot2[1] - dot1[1]) / (double)(dot2[0] - dot1[0]);
    }
}
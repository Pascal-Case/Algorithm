class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int cnt = 0;
        int zeroCnt = 0;
        for(int l : lottos) {
            if(l == 0) zeroCnt ++;
            else {
                for(int w : win_nums) {
                if(l == w) cnt++;
                }    
            }
        }
        
        answer[0] = func(cnt + zeroCnt);
        answer[1] = func(cnt);
        
        return answer;
    }
    
    public static int func(int n) {
        if(n == 6) return 1;
        if(n == 5) return 2;
        if(n == 4) return 3;
        if(n == 3) return 4;
        if(n == 2) return 5;
        return 6;
    }
}
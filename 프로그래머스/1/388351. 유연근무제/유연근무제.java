class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for(int i = 0; i < schedules.length; i++) {
            int schedule = foo(schedules[i]);
            int day = startday;
            
            // 1 2 3 4 5 6 7
            
            boolean flag = true;
            for(int j = 0; j < timelogs[i].length; j++, day = day % 7 + 1) {
                int t = timelogs[i][j];
                
                if(day == 6 || day == 7 || t <= 710) continue;
                
                if(t > 1110) {
                    flag = false;
                    break;
                }
                
                if(t > schedule) {
                    flag = false;
                    break;
                }
            }
            
            if(flag) answer++;
            
        }
        
        return answer;
    }
    
    public static int foo(int time) {
        int h = time / 100;
        int m = time % 100;
        m += 10;
        if(m >= 60) {
            m -= 60;
            h++;
        }
        return (h * 100) + m;
    }
        
}
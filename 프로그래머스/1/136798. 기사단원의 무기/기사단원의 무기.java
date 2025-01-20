class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            
            int money = 0;
            int cnt = 1;
            for(int j = 1; j <= i / 2; j++) {
                if(i % j == 0) {
                    cnt++;
                }
                
                if(cnt > limit) {
                    money = power;
                    break;
                }
            }
            
            answer += money == 0 ? cnt : money;
        }
        
        return answer;
    }
}
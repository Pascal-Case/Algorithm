class Solution {
    public String solution(int[] food) {
        String answer = "0";
        
        for(int i = food.length - 1; i > 0; i--) {
            int n = food[i] % 2 == 1 ? food[i] - 1 : food[i];
            
            while(n > 0) {
                answer = answer + i;
                answer = i + answer;
                n -= 2;
            }
            
        }
        
        return answer;
    }
}
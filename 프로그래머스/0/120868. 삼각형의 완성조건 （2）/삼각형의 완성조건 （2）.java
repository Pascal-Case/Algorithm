class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = Math.max(sides[0], sides[1]);
        int b = Math.min(sides[0], sides[1]);
        
        int c = 1;
        while(true) {
            
            if(a >= c && (a < b + c)) {
                answer++;
            } else if (a < c && (c < a + b)) {
                answer++;
            } else if(answer > 0) {
                break;
            }
            
            c++;
        }
        
        return answer;
    }
}
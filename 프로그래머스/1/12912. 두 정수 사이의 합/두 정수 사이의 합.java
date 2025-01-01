class Solution {
    public long solution(int a, int b) {
        int temp = 0;
        if(a == b) return a;
        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        } 
        long answer = 0;
        
        for(int i = a; i <= b; i++) {
            answer += i;
        }
        
        return answer;
    }
}
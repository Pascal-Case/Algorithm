class Solution {
    public int solution(int num) {
        int cnt = 0;
        while(num != 1) {
            if(num % 2 == 1) {
                num = (num * 3) + 1; 
            } else {
                num /= 2;
            }
            if(cnt++ == 500) return -1;
        }
        
        return cnt;
    }
}
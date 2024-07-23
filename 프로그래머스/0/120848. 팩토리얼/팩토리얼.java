class Solution {
    public int solution(int n) {
        int[] dp = new int [11];
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i <= 10; i++) {
            dp[i] = dp[i-1] * i;
        }
        
        for(int i = 1; i <= 9; i++) {
            if(dp[i + 1] > n && dp[i] <= n) {
                return i;
            }
        }
        return 10;
    }
}
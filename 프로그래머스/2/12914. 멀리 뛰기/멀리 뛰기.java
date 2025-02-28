class Solution {
    public long solution(int n) {
        long mod = 1234567L;
        long[] dp = new long[n + 1];
        long answer = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i <= 2){
                dp[i] = i;
            } else 
            dp[i] = dp[i-1] % mod + dp[i-2] % mod;
        }
        
        return dp[n] % mod;
    }
}
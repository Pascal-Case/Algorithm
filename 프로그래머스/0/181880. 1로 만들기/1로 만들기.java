class Solution {
    public int solution(int[] num_list) {
        int[] dp = new int[31];
        
        dp[1] = 0;
        dp[2] = 1;
        for(int i = 3; i <= 30; i++) {
            if(i % 2 == 0) {
                dp[i] = dp[i / 2] + 1;
            } else {
                dp[i] = dp[i - 1];
            }
        }
        
        int answer = 0;
        for(int num : num_list) {
            answer += dp[num];
        }
        return answer;
    }
}
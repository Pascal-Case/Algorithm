class Solution {
    public int solution(int n, int limit, int power) {
        int[] divisorCount = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                divisorCount[j]++;
            }
        }
        
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
            answer += divisorCount[i] > limit ? power : divisorCount[i];
        }
        
        return answer;
    }
}
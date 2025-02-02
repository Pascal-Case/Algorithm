class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int painted = 0;
        for(int s : section) {
            if(painted >= s) continue;
            painted = s + m - 1;
            answer++;
        }
        
        return answer;
    }
}
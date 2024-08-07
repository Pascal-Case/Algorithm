class Solution {
    public int solution(int[][] lines) {
        int[] count = new int[201];
        
        for(int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;
            
            for(int i = start; i < end; i++) {
                count[i]++;
            }
        }
        
        int answer = 0;
        
        for(int i = 0; i < 201; i++) {
            if(count[i] > 1) {
                answer++;
            }
        }
        return answer;
    }
}
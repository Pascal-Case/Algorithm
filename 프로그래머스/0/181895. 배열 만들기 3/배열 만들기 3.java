class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = new int[intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2];
        
        int idx = 0;
        for(int[] interval : intervals) {
            for(int i = interval[0] ; i <= interval[1] ; i++) {
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}
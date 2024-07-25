class Solution {
    public int[][] solution(int[][] arr) {
        int len1 = arr.length;
        int len2 = arr[0].length;
        int maxLen = Math.max(len1, len2);
        int[][] answer = new int[maxLen][maxLen];
        for(int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}

class Solution {
    public int[][] solution(int n) {
       int[][] answer = new int[n][n];
        int round = 1;
        int mark = 1;
        while (mark <= n * n) {
            for (int j = round - 1; j < n - round; j++) {
                answer[round - 1][j] = mark++;
            }
            for (int i = round - 1; i < n - round; i++) {
                answer[i][n - round] = mark++;
            }
            for (int j = n - round; j > round - 1; j--) {
                answer[n - round][j] = mark++;
            }
            for (int i = n - round; i > round - 1; i--) {
                answer[i][round - 1] = mark++;
            }
            if (mark == n * n && n % 2 == 1) {
                answer[n / 2][n / 2] = mark;
                break;
            }

            round++;
        }

        return answer;
    }
}
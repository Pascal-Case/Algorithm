import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = commands.length;
        int[] answer = new int[n];
        
        for(int i = 0; i < n; i++) {
            int left = commands[i][0] - 1;
            int right = commands[i][1];
            int k = commands[i][2] - 1;
            
            int[] copyArr = Arrays.copyOfRange(array, left, right);
            
            Arrays.sort(copyArr);
            
            answer[i] = copyArr[k];
        }
        
        
        return answer;
    }
}
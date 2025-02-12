import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        
        for(int l : lost) {
            arr[l-1]--;
        }
        
        for(int r : reserve) {
            arr[r-1]++;
        }
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                if(i > 0 && arr[i-1] == 2) {
                    arr[i]++;
                    arr[i-1]--;
                } else if(i < n-1 && arr[i+1] == 2) {
                    arr[i]++;
                    arr[i+1]--;
                }
            }
        }
        
        int answer = 0;
        for(int s : arr) {
            if(s > 0) answer++;
        }
      
        return answer;
    }
}
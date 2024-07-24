import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int max = 0;
        
        for(int n : arr) {
            int cnt = 0;
            while((n >= 50 && n % 2 == 0) || (n < 50 && n % 2 == 1) ) {
                if(n % 2 == 0) {
                    n /= 2;
                } else {
                    n = n * 2 + 1;
                }
                cnt++;
            }
            max = Math.max(max, cnt);
        }
       
        return max;
    }
   
}
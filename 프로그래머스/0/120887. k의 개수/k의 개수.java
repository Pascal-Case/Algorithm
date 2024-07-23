import java.util.stream.*;
class Solution {
    public int solution(int i, int j, int k) {
        return (int) IntStream.rangeClosed(i, j).map(n -> count(n, k)).sum();
    }
    public static int count(int n, int k) {
        if(n < 10 && n == k) return 1; 
        int cnt = 0;
        int temp = 0;
        while(n > 0) {
            temp = n % 10;
            if(temp == k) cnt++;
            n /= 10;
        }
        return cnt;
    }
}
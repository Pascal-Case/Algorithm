import java.util.Arrays;
class Solution {
    public long solution(long n) {
        char[] digits = String.valueOf(n).toCharArray();
        
        Arrays.sort(digits);
        
        StringBuilder sortedNum = new StringBuilder(new String(digits));
        sortedNum.reverse();
        
        return Long.parseLong(sortedNum.toString());
    }
}
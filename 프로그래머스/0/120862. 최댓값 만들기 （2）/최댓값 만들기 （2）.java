import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i != j) max = Math.max(max, numbers[i] * numbers[j]);
            }
        }
        return max;
    }
}
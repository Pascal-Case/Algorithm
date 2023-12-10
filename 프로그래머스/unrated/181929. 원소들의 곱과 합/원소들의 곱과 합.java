import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        return Arrays.stream(num_list).reduce(1, (left, right) -> left * right) > (int) Math.pow(Arrays.stream(num_list).sum(), 2) ? 0 : 1;
    }
}
import java.util.Arrays;
class Solution {
    public int solution(int[] l, int n) {
        return Arrays.stream(l).filter(x -> x == n).count() > 0 ? 1 : 0;
    }
}
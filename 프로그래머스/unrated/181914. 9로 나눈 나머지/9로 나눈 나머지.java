import java.util.Arrays;
class Solution {
    public int solution(String number) {
        return Arrays.stream(Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray()).sum() % 9;
    }
}
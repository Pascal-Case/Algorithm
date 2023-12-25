import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        return IntStream.range(0, numbers.length).map(i -> numbers[(i + (direction.equals("right") ? -1 : 1) + numbers.length) % numbers.length]).toArray();
    }
}
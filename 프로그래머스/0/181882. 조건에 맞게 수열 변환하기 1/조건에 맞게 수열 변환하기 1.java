import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr) {
        return IntStream.of(arr).map(i -> {
            if(i % 2 == 0 && i >= 50) {
                return i / 2;
            } else if (i % 2 == 1 && i < 50) {
                return i * 2;
            }
            return i;
        }).toArray();
    }
}
import java.util.stream.Stream;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        return Stream.of(Arrays.copyOfRange(num_list, n, num_list.length), Arrays.copyOfRange(num_list, 0, n)).flatMapToInt(Arrays::stream).toArray();
    }
}
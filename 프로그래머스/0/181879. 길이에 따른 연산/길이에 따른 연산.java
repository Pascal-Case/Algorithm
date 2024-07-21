import java.util.stream.*;
class Solution {
    public int solution(int[] num_list) {
        return num_list.length <= 10 
            ? IntStream.of(num_list).reduce(1, (acc, cur) -> acc * cur)
            : IntStream.of(num_list).sum();
    }
}
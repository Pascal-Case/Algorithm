import java.util.stream.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        return IntStream.rangeClosed(1, num_list.length).filter(i -> (i - 1) % n == 0).map(i -> num_list[i - 1]).toArray();
    }
}
import java.util.Arrays;
class Solution {
    public int solution(int[] num_list) {
        return Arrays.stream(Arrays.stream(num_list).filter(value -> value % 2 == 1).toArray()).reduce((left, right) -> Integer.parseInt(left + "" + right)).getAsInt() +
            Arrays.stream(Arrays.stream(num_list).filter(value -> value % 2 == 0).toArray()).reduce((left, right) -> Integer.parseInt(left + "" + right)).getAsInt();
    }
}
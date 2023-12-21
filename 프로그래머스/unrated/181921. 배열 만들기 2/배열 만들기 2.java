import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int l, int r) {
        int[] answer = IntStream.range(l, r + 1)
                .filter(x -> (Integer.toString(x).startsWith("5")))
                .filter(x -> (Integer.toString(x).endsWith("5") || Integer.toString(x).endsWith("0")))
                .filter(x -> {
                   
                    while (x / 10 != 0) {
                        if (Integer.toString(x).endsWith("5") || Integer.toString(x).endsWith("0")) {
                            x /= 10;
                        } else {
                            return false;
                        }
                    }

                    return true;
                })
                .toArray();

        return answer.length > 0 ? answer : new int[]{-1};
    }
}
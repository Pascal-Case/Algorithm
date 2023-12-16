import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Integer> solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        for (int[] query : queries) {
            int min = Integer.MAX_VALUE;
            for (int i = query[0]; i <= query[1]; i++) {
                if (arr[i] > query[2]) {
                    min = Math.min(arr[i], min);
                }
            }
            if (min == Integer.MAX_VALUE) {
                min = -1;
            }
            answer.add(min);

        }
        return answer;
    }
}
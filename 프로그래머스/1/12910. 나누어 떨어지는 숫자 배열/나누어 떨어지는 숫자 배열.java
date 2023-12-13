import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(value -> value % divisor == 0).sorted().toArray();
        if (answer.length == 0) {
            answer = new int[1];
            answer[0] = -1;
        }

        return answer;
    }
}
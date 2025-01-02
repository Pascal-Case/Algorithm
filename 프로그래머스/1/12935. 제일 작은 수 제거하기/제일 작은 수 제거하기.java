import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
        int[] answer = Arrays.stream(arr).filter(v -> v != min).toArray();
        return answer;
    }
}
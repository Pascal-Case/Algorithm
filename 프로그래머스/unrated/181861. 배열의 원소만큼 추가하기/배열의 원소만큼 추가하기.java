import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[][] arr2 = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            int[] temp = new int[arr[i]];
            for (int j = 0; j < arr[i]; j++) {
                temp[j] = arr[i];
            }
            arr2[i] = temp.clone();
        }
        return Arrays.stream(arr2).flatMapToInt(Arrays::stream).toArray();
    }
}
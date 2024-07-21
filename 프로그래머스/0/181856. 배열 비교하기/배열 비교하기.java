import java.util.stream.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        return arr1.length != arr2.length 
            ? arr1.length > arr2.length ? 1 : -1
            : IntStream.of(arr1).sum() == IntStream.of(arr2).sum() 
                ? 0 
                : IntStream.of(arr1).sum() > IntStream.of(arr2).sum() 
                    ? 1 : -1;
    }
}
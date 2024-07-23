import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String[] arr = my_string.replaceAll("[^0-9]", "").split("");
        return Arrays.stream(arr).mapToInt(i -> Integer.parseInt(i)).sorted().toArray();
    }
}
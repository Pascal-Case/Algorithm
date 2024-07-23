import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int l = -1;
        int r = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                if(l == -1) {
                    l = i;
                    r = l;
                } else {
                    r = i;
                }
            }
        }
        return l != -1 ? Arrays.copyOfRange(arr, l, r + 1) : new int[]{-1};
    }
}
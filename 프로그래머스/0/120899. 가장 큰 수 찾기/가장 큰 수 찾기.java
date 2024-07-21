class Solution {
    public int[] solution(int[] array) {
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                idx = i;
                max = array[i];
            }
        }
        return new int[]{max, idx};
    }
}
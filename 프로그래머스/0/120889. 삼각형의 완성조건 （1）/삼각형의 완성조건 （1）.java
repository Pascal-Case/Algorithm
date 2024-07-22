class Solution {
    public int solution(int[] sides) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int side: sides) {
            max = Math.max(max, side);
            sum += side;
        }
        return max < (sum - max) ? 1 : 2;
    }
}
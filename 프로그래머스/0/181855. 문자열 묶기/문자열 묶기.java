class Solution {
    public int solution(String[] strArr) {
        int[] answer = new int[31];
        for(String str : strArr) {
            answer[str.length()]++;
        }
        int max = Integer.MIN_VALUE;
        for(int a : answer) {
            max = Math.max(a, max);
        }
        return max;
    }
}
class Solution {
    public int solution(int[] array, int n) {
        int answer = 10000;
        for(int num : array) {
            if(Math.abs(num - n) < Math.abs(answer - n)) {
                answer = num;
            } else if(Math.abs(num - n) == Math.abs(answer - n)) {
                answer = Math.min(num, answer);
            }
        }
        return answer;
    }
}
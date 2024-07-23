class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int n : array) {
            answer += String.valueOf(n).replaceAll("[^7]", "").length();
        }
        return answer;
    }
}
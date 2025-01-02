class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i = 0; i < signs.length; i++) {
            answer = answer + (signs[i] ? absolutes[i] : -absolutes[i]);
        }
        
        return answer;
    }
}
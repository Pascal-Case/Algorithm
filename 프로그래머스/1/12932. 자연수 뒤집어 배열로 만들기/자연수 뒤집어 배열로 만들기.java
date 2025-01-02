class Solution {
    public int[] solution(long n) {
        String nStr = Long.toString(n);
        int[] answer = new int[nStr.length()];
        
        int cnt = 0;
        for(int i = nStr.length()-1; i >= 0; i--) {
            answer[cnt++] = Character.getNumericValue(nStr.charAt(i));
        }
        
        return answer;
    }
}
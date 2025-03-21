class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        int num = 0;
        int turn = 0;
        while(true) {
            String s = Integer.toString(num++, n).toUpperCase();
            
            for(int i = 0; i < s.length(); i++) {
                turn = (turn) % m + 1;
                if(turn == p) {
                    answer += String.valueOf(s.charAt(i));
                }
                if(answer.length() == t) return answer;
            }
        }
    }
}
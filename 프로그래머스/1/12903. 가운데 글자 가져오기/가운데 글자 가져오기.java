class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        String answer = s.length() % 2 == 1 ? 
            String.valueOf(ch[s.length() / 2]) :
            String.valueOf(ch[s.length() / 2 - 1]) + String.valueOf(ch[s.length() / 2]);
        return answer;
    }
}
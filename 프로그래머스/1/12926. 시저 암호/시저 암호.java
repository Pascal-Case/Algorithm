class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int step = 26;
        char[] arr = s.toCharArray();
        
        for(char c : arr) {
            if('a' <= c && c <= 'z') {
                c = (char) (c - 'a');
                c = (char) ((c + n) % step);
                c = (char) (c + 'a');
            } else if ('A' <= c && c <= 'Z') {
                c = (char) (c - 'A');
                c = (char)((c + n) % step);
                c = (char) (c + 'A');   
            }
            answer += String.valueOf(c);
        }
        
        return answer;
    }
}
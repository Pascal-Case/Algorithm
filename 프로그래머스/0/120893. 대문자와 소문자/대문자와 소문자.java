class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        int step = 'A' - 'a';
        for(char c : my_string.toCharArray()) {
            if('a' <= c && c <= 'z') {
                sb.append((char)(c + step));
            } else {
                sb.append((char)(c - step));
            }
        }
        
        return sb.toString();
    }
}
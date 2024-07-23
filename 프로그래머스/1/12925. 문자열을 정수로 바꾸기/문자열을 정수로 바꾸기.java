class Solution {
    public int solution(String s) {
        if(s.startsWith("+")) return Integer.parseInt(s.substring(1));
        else if(!s.startsWith("-")) return Integer.parseInt(s);
        return -Integer.parseInt(s.substring(1));
    }
}
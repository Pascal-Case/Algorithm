class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        
        for (char c : s.toCharArray()) {
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
                return false;
            }
        }
        
        return true;
    }
}
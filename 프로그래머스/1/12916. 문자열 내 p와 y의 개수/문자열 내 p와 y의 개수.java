class Solution {
    boolean solution(String s) {
        if(s.replaceAll("[yYpP]", "").equals(s)) return true;
        return s.replaceAll("[pP]", "").length() == s.replaceAll("[yY]", "").length();
    }
}
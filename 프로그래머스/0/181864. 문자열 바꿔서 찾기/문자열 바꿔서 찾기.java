class Solution {
    public int solution(String myString, String pat) {
        return myString.replaceAll("A", "C").replaceAll("B", "A").replaceAll("C", "B").indexOf(pat) == -1 ? 0 : 1;
    }
}
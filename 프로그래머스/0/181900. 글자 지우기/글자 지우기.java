class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int i : indices) {
            sb.setCharAt(i, '0');
        }
        
        return sb.toString().replace("0", "");
    }
}
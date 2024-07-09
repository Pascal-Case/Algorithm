class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            reverse(sb, s, e);
        }
        
        return sb.toString();
    }
    
    private void reverse(StringBuilder sb, int start, int end) {
        while(start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
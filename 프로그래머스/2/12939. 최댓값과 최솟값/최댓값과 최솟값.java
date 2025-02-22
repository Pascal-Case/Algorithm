class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        String[] arr = s.split(" ");
        
        for(int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            max = Math.max(n, max);
            min = Math.min(n, min);
        }
        
        return min + " " + max;
    }
}
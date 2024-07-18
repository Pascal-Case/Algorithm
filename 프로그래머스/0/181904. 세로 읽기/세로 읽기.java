class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        char[] arr = my_string.toCharArray();
        
        for(int i = 0; i < arr.length / m; i++) {
            int idx = i * m + c - 1;
            answer += String.valueOf(arr[idx]);
        }
        return answer;
    }
}
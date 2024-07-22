class Solution {
    public String solution(int age) {
        int step = 'a' - '0';
        
        char[] arr = String.valueOf(age).toCharArray();
        
        String answer = "";
        for(char c : arr) {
            answer += String.valueOf((char) (c + step));
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(char c : my_string.toCharArray()) {
            if(!String.valueOf(c).equals(letter)) answer += String.valueOf(c);
        }
        return answer;
    }
}
import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String, Character> map = new HashMap<>();
        
        for(int i = 0; i < morse.length; i++) {
            map.put(morse[i], (char)('a' + i));
        }
        
        String[] words = letter.split(" ");
        
        String answer = "";
        for(String word : words) {
            answer += String.valueOf(map.get(word));
        }
        return answer;
    }
}
import java.util.*;
class Solution {
    public static final Character[] VOWELS = {'A', 'E', 'I', 'O', 'U'};
    public int solution(String word) {
        List<String> words = new ArrayList<>();
        generateWords("", words);
        return words.indexOf(word);
    }
    
    public static void generateWords(String w, List<String> words) {
        words.add(w);
        
        if(w.length() == 5) return;
        
        for(Character c : VOWELS) {
            generateWords(w + c, words);
        }
        
    }
}
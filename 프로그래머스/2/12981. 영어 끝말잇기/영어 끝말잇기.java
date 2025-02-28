import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        int[] answer = {0, 0};
        
        char prevLastWord = words[0].charAt(words[0].length()-1);
        map.put(words[0], 1);
        int idx = 1;
        
        int round = 1;
        int person = 2;
        while(idx != words.length) {
            String word = words[idx++];
            int count = map.getOrDefault(word, 0);
            
            if(count != 0 || word.charAt(0) != prevLastWord) {
                return new int[]{person, round};
            } 
            
            map.put(word, 1);
            
            person++;
            
            if(person > n) {
                person = 1;
                round++;
            }
            
            prevLastWord = word.charAt(word.length() - 1);
        }


        return answer;
    }
}
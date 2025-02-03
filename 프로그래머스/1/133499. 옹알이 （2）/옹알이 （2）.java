import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            String b = babbling[i];
            
            if(b == "") continue;
            
            for(int j = 0; j < words.length; j++) {
                String w = words[j];
                if(b.contains(w) && !b.contains(w + w)) {
                    b = b.replace(w, "+");
                }
            }
            
            if(b.replace("+", "") == "") answer++;
            
        }
        return answer;
    }
}
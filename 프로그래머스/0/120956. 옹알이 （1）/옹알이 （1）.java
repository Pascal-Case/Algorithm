class Solution {
     public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        
        for (String bab : babbling) {
            if (canPronounce(bab, words)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean canPronounce(String bab, String[] words) {
        String prevWord = "";
        while (bab.length() > 0) {
            boolean found = false;
            for (String word : words) {
                if (bab.startsWith(word) && !word.equals(prevWord)) {
                    prevWord = word;
                    bab = bab.substring(word.length());
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }
                   
}
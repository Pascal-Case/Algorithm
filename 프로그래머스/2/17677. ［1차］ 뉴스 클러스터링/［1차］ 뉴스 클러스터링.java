import java.util.*;
import java.util.regex.*;
class Solution {
    public int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        for(int i = 1; i < str1.length(); i++) {
            String word = str1.substring(i - 1, i + 1);
            if(Pattern.matches("^[a-zA-Z]*$", word)) {
                list1.add(word.toUpperCase());
            }
        }
        
        for(int i = 1; i < str2.length(); i++) {
            String word = str2.substring(i - 1, i + 1);
            if(Pattern.matches("^[a-zA-Z]*$", word)) {
                list2.add(word.toUpperCase());
            }
        }
        int inter = 0;
        for(String s1 : list1) {
            if(list2.contains(s1)) {
                list2.remove(s1);
                inter++;
            }
        }
        
        int union = list1.size() + list2.size();
        
        if(union == 0) {
            
            if(str1.toUpperCase().equals(str2.toUpperCase())) {
                return 65536;
            } else {
                return 1;
            }
            
        }
        
        int answer = 65536 * inter / union;
        return answer;
    }
}
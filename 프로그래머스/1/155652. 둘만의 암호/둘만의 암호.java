import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<String> list = new ArrayList<>(List.of("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
        
        for(int i = 0; i < skip.length(); i++) {
            list.remove(Character.toString(skip.charAt(i)));
        }
        
        for(int i = 0; i < s.length(); i++) {
            String str = Character.toString(s.charAt(i));
            int idx = list.indexOf(str);
            answer += list.get((idx + index) % list.size());
        }

        return answer;
    }
}
import java.util.*;
import java.util.Map.Entry;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for(String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        for(Entry<String, Integer> set : map.entrySet()) {
            if(set.getValue() != 0) {
                answer = set.getKey();
                break;
            }
        }
        
        return answer;
    }
}
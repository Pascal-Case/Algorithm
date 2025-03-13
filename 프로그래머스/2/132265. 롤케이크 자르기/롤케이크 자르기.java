import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        for(int t : topping) {
            map1.put(t, map1.getOrDefault(t, 0) + 1);
        }
        
        for(int t : topping) {
            if(map1.get(t) == 1) map1.remove(t);
            else map1.put(t, map1.get(t) - 1);
            
            map2.put(t, map2.getOrDefault(t, 0) + 1);
            
            if(map1.size() == map2.size()) answer++;
        }
        
        return answer;
    }
}
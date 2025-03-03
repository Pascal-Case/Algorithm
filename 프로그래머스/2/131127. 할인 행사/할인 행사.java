import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 0;
        int idx = 0;
        while(discount.length - 10 - idx >= 0) {
            map = new HashMap<>();
            
            for(int i = 0; i < want.length; i++) {
                map.put(want[i], number[i]);
            
            }
            
            for(int i = idx; i < idx + 10; i++){
                String d = discount[i];
                if(!map.containsKey(d)) break;
                map.put(d, map.get(d) - 1);
            }
            
            boolean flag = true;
            for(Map.Entry<String, Integer> set : map.entrySet()) {
                if(set.getValue() > 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer++;
            idx++;
        }
        
        
        return answer;
    }
}
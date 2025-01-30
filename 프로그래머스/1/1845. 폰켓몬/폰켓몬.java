import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int n = nums.length / 2;
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        if(map.size() >= n) {
            return n;
        } else {
            return map.size();
        }
    }
}
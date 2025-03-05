import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        
        for(int start = 0; start < elements.length; start++) {
            for(int i = 1; i < elements.length; i++) {
                int sum = 0;
                int count = 0;
                int idx = start;
                while(count < i) {
                    sum += elements[idx];
                    idx = (idx + 1) % elements.length;
                    count++;
                }
                set.add(sum);
            }
        }
        return set.size() + 1;
    }
}
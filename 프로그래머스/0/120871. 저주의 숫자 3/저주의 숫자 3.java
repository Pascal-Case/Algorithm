import java.util.*;
class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        int count = 1;
        while(list.size() != n) {
            while(count % 3 == 0 || Integer.toString(count).indexOf("3") != -1) {
                count++;
            }
      
            list.add(count);
            count++;
        }
        return list.get(n - 1);
    }
}
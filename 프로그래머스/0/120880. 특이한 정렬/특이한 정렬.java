import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Integer> list = new ArrayList<>();
        for (int num : numlist) {
            list.add(num);
        }
        
        Collections.sort(list, (o1, o2) -> {
            int abs1 = Math.abs(n - o1);
            int abs2 = Math.abs(n - o2);

            if (abs1 == abs2) {
                return o2 - o1;
            } else {
                return abs1 - abs2;
            }
        });
        
        return list.stream().mapToInt(i -> i).toArray();

    }
}
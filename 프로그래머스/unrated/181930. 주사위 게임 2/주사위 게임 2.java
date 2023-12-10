import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        int answer = a + b + c;
        switch(set.size()) {
            case 1:
                answer *= ((int) Math.pow(a, 3) + (int) Math.pow(b, 3) + (int) Math.pow(c, 3));
            case 2:
                answer *= ((int) Math.pow(a, 2) + (int) Math.pow(b, 2) + (int) Math.pow(c, 2));
            case 3:
                break;
        }
        return answer;
    }
}
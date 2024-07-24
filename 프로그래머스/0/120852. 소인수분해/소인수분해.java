import java.util.*;
class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while(n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        if (n != 1) {
			set.add(n);
		}
        
        int[] answer = new int[set.size()];
        int idx = 0;
        for(int i : set) {
            answer[idx++] = i;
        }
     
        Arrays.sort(answer);
        return answer;
    }
}
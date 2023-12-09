import java.util.TreeSet;
import java.util.List;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        TreeSet<Integer> list = new TreeSet<>();
        int[] operator = {10000, 100, 1};
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                list.add(rank[i]);
            }
        }
     
        for (int i = 0; i < 3; i++) {
            int num = list.pollFirst();
            for (int j = 0; j < rank.length; j++) {
                if (num == rank[j]) {
                    answer += j * operator[i];
                    break;
                }
            }
        }
        
        return answer;
    }
}
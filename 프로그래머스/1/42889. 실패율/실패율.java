import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] participants = new int[N+1];
        int[] fails = new int[N+1];
        Integer[] answer = new Integer[N];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = i+1;
        }
        
        for(int s : stages) {   
            for(int i = 1; i < s; i++) {
                participants[i]++;
            }
            if(s <= N) {
                participants[s]++;
                fails[s]++;
            }
        }
        
        Arrays.sort(answer, (o1, o2) -> {
            double f1 = fails[o1] / (double) participants[o1];
            double f2 = fails[o2] / (double) participants[o2];
            
            if(f1 > f2) {
                return -1;
            } else if(f2 > f1) {
                return 1;
            } else {
                return 0;
            }
        });
        
           
        
        return Arrays.stream(answer).mapToInt(Integer::intValue).toArray();
    }
}
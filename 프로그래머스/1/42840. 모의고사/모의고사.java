import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {2,1,2,3,2,4,2,5};
        int[] a3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[][] arr = {a1, a2, a3};
        int[] students = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
           int ans = answers[i];
            for(int j = 0; j < 3; j++) {
                int[] a = arr[j];
                int cur = a[i % a.length];
                if(cur == ans) students[j]++;
            }       
        }
        
        int max = -1;
        for(int i = 0; i < 3; i++) {
            max = Math.max(max, students[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(max == students[i]) list.add(i+1);
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(answer);
        
        return answer;
    }
}
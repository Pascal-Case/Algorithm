import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> arrList = new ArrayList<>(); 
        int[] answer = new int[k];
        Arrays.fill(answer , -1); 

        for(int n : arr) {
            if(arrList.indexOf(n) == -1 ) {
                arrList.add(n); 
            }
        }

        int maxLen = arrList.size() > k ? k : arrList.size();

        for(int i = 0; i < maxLen; i++) {
            answer[i] = arrList.get(i); 
        }    

        return answer;
    }
}
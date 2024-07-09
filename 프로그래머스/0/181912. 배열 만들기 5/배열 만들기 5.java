import java.util.ArrayList;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s + l));
            if(num > k) {
                list.add(num);                
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
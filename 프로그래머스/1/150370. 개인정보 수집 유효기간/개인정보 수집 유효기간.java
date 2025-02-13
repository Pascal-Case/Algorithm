import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String t : terms) {
            map.put(t.split(" ")[0], Integer.parseInt(t.split(" ")[1]));
        }
        
        int y = Integer.parseInt(today.substring(0, 4));
        int m = Integer.parseInt(today.substring(5, 7));
        int d = Integer.parseInt(today.substring(8, 10));
        int todayTotal = d + (m * 28) + (y * 28 * 12);
        
        for(int i = 0; i < privacies.length; i++) {
            String privacy = privacies[i];
            String term = privacy.split(" ")[1];         
                        
            String date = privacy.split(" ")[0];
            int l = map.get(term);
            
            int limitY = Integer.parseInt(date.substring(0, 4));
            int limitM = Integer.parseInt(date.substring(5, 7));
            int limitD = Integer.parseInt(date.substring(8, 10));

            int limitTotal = limitD + (limitM * 28) + (l * 28) + (limitY * 28 * 12);
            
            if(todayTotal >= limitTotal) list.add(i+1);
            
        }
        
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
import java.util.HashMap;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("R", 0);
        map.put("T", 0);
        map.put("F", 0);
        map.put("C", 0);
        map.put("M", 0);
        map.put("J", 0);
        map.put("A", 0);
        map.put("N", 0);
        
        for(int i = 0; i < survey.length; i++) {
            String left = survey[i].split("")[0];
            String right = survey[i].split("")[1];
            
            int choice = choices[i];
            
            if(choice < 4) {
                map.put(left, map.get(left) + Math.abs(choice - 4));
            } else if (choice > 4) {
                map.put(right, map.get(right) + choice - 4);
            }
        }
        
        answer += map.get("R") >= map.get("T") ? "R" : "T";
        answer += map.get("C") >= map.get("F") ? "C" : "F";
        answer += map.get("J") >= map.get("M") ? "J" : "M";
        answer += map.get("A") >= map.get("N") ? "A" : "N";
        
        return answer;
    }
}
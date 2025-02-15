import java.util.HashMap;
class Solution {
    private static final HashMap<String, int[]> pad = new HashMap<>();
    
    static {
        pad.put("1", new int[]{0, 0});
        pad.put("2", new int[]{0, 1});
        pad.put("3", new int[]{0, 2});
        pad.put("4", new int[]{1, 0});
        pad.put("5", new int[]{1, 1});
        pad.put("6", new int[]{1, 2});
        pad.put("7", new int[]{2, 0});
        pad.put("8", new int[]{2, 1});
        pad.put("9", new int[]{2, 2});
        pad.put("*", new int[]{3, 0});
        pad.put("0", new int[]{3, 1});
        pad.put("#", new int[]{3, 2});
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[] lPrev = {3, 0};
        int[] rPrev = {3, 2};
        
        boolean moveLeft = true;
        for(int num : numbers) {
            int[] targetPosition = pad.get(String.valueOf(num));
            
            if(num == 1 || num == 4 || num == 7){
                moveLeft = true;
            } else if(num == 3 || num == 6 || num == 9) {
                moveLeft = false;
            } else {
                int lDistance = calDistance(lPrev, targetPosition);
                int RDistance = calDistance(rPrev, targetPosition);
                
                if(lDistance == RDistance) {
                    if(hand.equals("left")) {
                        moveLeft = true;
                    } else {
                        moveLeft = false;
                    }
                    
                } else if(lDistance > RDistance) {
                    moveLeft = false;
                } else {
                    moveLeft = true;
                }
            }
            
            if(moveLeft) {
                answer += "L";
                lPrev = targetPosition;
            } else {
                answer += "R";
                rPrev = targetPosition;
            }
            
        }
        
        return answer;
    }
    
    public static int calDistance(int[] pos1, int[] pos2) {
        return Math.abs(pos1[0] - pos2[0]) + Math.abs(pos1[1] - pos2[1]);
    }
}
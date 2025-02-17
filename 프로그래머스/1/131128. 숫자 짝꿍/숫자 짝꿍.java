
class Solution {
    public String solution(String X, String Y) {
        int[] xNums = new int[10];
        int[] yNums = new int[10];
        StringBuilder answer = new StringBuilder();
        
        for(char c : X.toCharArray()) {
            xNums[Character.getNumericValue(c)]++;
        }
        for(char c : Y.toCharArray()) {
            yNums[Character.getNumericValue(c)]++;
        }
        
        
        for(int i = 9; i >= 0; i--) {
            if(xNums[i] > 0 && yNums[i] > 0) {
                if(i == 0 && answer.length() == 0) return "0";
                
                int cnt = Math.min(xNums[i], yNums[i]);
                while(cnt > 0) {
                    answer.append(Integer.toString(i));
                    cnt--;
                }
            }
        }
        
        return answer.length() == 0 ? "-1" : answer.toString();
    }
}
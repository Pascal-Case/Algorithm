class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++) {
            int score = 0;
            
            for(int j = 0; j < photo[i].length; j++) {
                String cur = photo[i][j];
                
                for(int k = 0; k < name.length; k++) {
                    if(cur.equals(name[k])) {
                        score += yearning[k];
                        break;
                    }
                }
                
            }
            
            answer[i] = score;
        }
        
        return answer;
    }
}
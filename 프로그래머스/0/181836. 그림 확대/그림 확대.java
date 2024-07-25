class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int idx = 0;
        for(int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < picture[i].length(); j++){
                sb.append(String.valueOf(picture[i].charAt(j)).repeat(k));
            }
            
            int cnt = 0;
            while(cnt != k) {
                answer[idx++] = sb.toString();
                cnt++;
            }
            
        }
        return answer;
    }
}
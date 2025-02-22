class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        
        boolean flag = true;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if('0' <= c && c <= '9') {
                flag = false;
            } else if('a' <= c && c <= 'z') {
                
                if(flag) {
                    c = Character.toUpperCase(c);
                    flag = false;
                }
                
            } else {
                flag = true;
            }
            
            answer += Character.toString(c);
        }
        
        
        return answer;
    }
}
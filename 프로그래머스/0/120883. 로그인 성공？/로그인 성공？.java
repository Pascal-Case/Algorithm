class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String input_id = id_pw[0];
        String input_pw = id_pw[1];
        
        for(String[] user : db) {
            String id = user[0];
            String pw = user[1];
            
            if(id.equals(input_id)) {
                if(pw.equals(input_pw)) return "login";
                return "wrong pw";
            }
        
        }
        
        return "fail";
    }
}
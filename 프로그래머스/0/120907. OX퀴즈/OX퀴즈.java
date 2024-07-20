class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] q = quiz[i].split("=");
            
            String l = q[0].trim();
            int rightResult = Integer.parseInt(q[1].trim());
            
            String[] left = l.split(" ");
            boolean isMinus = false;
            
            int leftResult = 0;
            for(String s : left) {
                if(s.equals("+")) {
                    isMinus = false;
                    continue;
                } else if(s.equals("-")) {
                    isMinus = true;
                    continue;
                }
                
                if(isMinus) {
                    leftResult -= Integer.parseInt(s);
                } else {
                    leftResult += Integer.parseInt(s);
                }
            }
            
            
            answer[i] = leftResult == rightResult ? "O" : "X";
        }
        
        return answer;
    }
}
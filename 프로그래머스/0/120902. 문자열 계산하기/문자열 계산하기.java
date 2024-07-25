class Solution {
    public int solution(String my_string) {
        int answer = 0;
        boolean isMinus = false;
        for(String s : my_string.split(" ")) {
            if("+".equals(s)) {
                isMinus = false;
            } else if("-".equals(s)) {
                isMinus = true;
            } else {
                if(isMinus) {
                    answer -= Integer.parseInt(s);
                } else {
                    answer += Integer.parseInt(s);
                }
            }
        }
        return answer;
    }
}
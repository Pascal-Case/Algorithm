class Solution {
    public String solution(String my_string) {
        String answer = "";
        while(!my_string.isEmpty()) {   
            String target = String.valueOf(my_string.charAt(0));
            answer += target;
            my_string = my_string.replace(target, "");
        }
        return answer;
    }
}
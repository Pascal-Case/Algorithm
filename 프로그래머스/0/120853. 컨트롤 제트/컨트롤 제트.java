import java.util.Stack;
class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] arr = s.split(" ");
        
        for(String str : arr) {
            if(str.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        
        int answer = 0;
        while(!stack.isEmpty()) {
            answer += stack.pop();
        }
        
        return answer;
    }
}
import java.util.*;
class Solution {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");
        boolean answer = true;

        for(String op : arr) {
            if(op.equals("(")) {
                stack.push("(");
            } else {
                if(stack.size() == 0) {
                    return false;
                }
                stack.pop();
            }
        }
        
        if(stack.size() != 0) answer = false;

        return answer;
    }
}
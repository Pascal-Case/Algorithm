import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(stack.size() == 0) {
                stack.push(arr[i]);
                continue;
            }
            
            
            if(stack.peek() == arr[i]) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }
}
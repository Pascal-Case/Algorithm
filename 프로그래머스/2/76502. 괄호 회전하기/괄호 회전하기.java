import java.util.*;
class Solution {
    public int solution(String s) {
        if(s.length() == 1) return 0;
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            s = s.substring(1, s.length()) + s.substring(0, 1);
            if(check(s)) answer++;
        }
        return answer;
    }
    
    public static boolean check(String s) {
        HashMap<Character, Character> map = new HashMap();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()) {
            if(c == '{' || c == '(' || c == '['){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) return false;
                if(map.get(c) != stack.peek()) return false;
                stack.pop();
            }
        }
        
        return stack.isEmpty() ? true : false;
    }
}
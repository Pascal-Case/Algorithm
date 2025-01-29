import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
        for(int ing : ingredient) {
            stack.push(ing);
            
            int size = stack.size();
            if(size >= 4) {
                if(stack.get(size - 4) == 1 &&
                   stack.get(size - 3) == 2 && 
                   stack.get(size - 2) == 3 &&
                   stack.get(size - 1) == 1) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    
                    answer++;
                }
            }
            
        }
        
        return answer;
    }
}
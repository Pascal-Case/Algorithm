import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
         int[] answer = {};
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.isEmpty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        answer = new int[stack.size()];
        int index = 0;
        while (!stack.isEmpty()) {
            answer[index] = stack.pop();
            index++;
        }
    
        return answer;
    }
}
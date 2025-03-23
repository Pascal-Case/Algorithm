import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> s = new Stack<>();
        s.push(numbers[numbers.length - 1]);
        for(int i = numbers.length - 2; i >= 0; i--) {
            int a = -1;
            
            if(numbers[i + 1] > numbers[i]) {
                a = numbers[i + 1];
            } else {
                 while(!s.isEmpty() && s.peek() <= numbers[i]){
                    s.pop();
                }
                a = s.isEmpty() ? -1 : s.peek();
            }
            answer[i] = a;
            s.push(numbers[i]);
        }
        
        answer[numbers.length - 1] = -1;
        
        return answer;
    }
}
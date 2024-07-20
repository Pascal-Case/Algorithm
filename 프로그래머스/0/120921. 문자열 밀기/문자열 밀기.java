import java.util.*;
class Solution {
    public int solution(String A, String B) {
        Deque<Character> dq = new LinkedList<>();
        int count = 0;
        
        for(char c : A.toCharArray()) {
            dq.add(c);
        }
        while(true) {
            if(count >= A.length()) {
                count = -1;
                break;
            }
            
            if(check(dq, B)){
                return count;
            }
            
            dq.addFirst(dq.pollLast());
        
            count++;
        } 
    
        
        return -1;
    }
    
    public static boolean check(Deque<Character> dq, String B) {  
        StringBuilder sb = new StringBuilder();
        for (Character ch : dq) {
            sb.append(ch);
        }
        return sb.toString().equals(B);
    }
}
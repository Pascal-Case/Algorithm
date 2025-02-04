import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] arr = dartResult.split("");
        Queue<String> queue = new LinkedList<>();
        for(int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        
        int prev = Integer.MAX_VALUE;
        while(queue.size() != 0) {
            int cur = Integer.parseInt(queue.poll());
            if(queue.peek().equals("0")) {
                queue.poll();
                cur = 10;
            }
            
            String symbol = queue.poll();
            String option = "";
            if(queue.size() > 0 && (queue.peek().equals("*") || queue.peek().equals("#"))) 
                option = queue.poll();
            
            cur = cal(cur, symbol);
            
            if(option != "") {
                cur = calOp(cur, option);
                if(prev != Integer.MAX_VALUE && option.equals("*")) prev = calOp(prev, option);
            }
            
            if(prev != Integer.MAX_VALUE) answer += prev;
            
            prev = cur;
        }
        
        answer += prev;
            
        return answer;
    }
    
    public static int calOp(int n, String option) {
        if(option.equals("*")) return n * 2;
        
        return n * -1;
    }
 
    public static int cal(int n, String symbol) {
        double point = 0D;
        if(symbol.equals("S")) {
            point = n;
        } else if(symbol.equals("D")) {
            point = Math.pow(n, 2);
        } else if(symbol.equals("T")) {
            point = Math.pow(n, 3);
        }
        return (int) point;
    }
}
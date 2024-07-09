import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String> () {
            @Override
            public int compare(String o1, String o2) {
                String order1 = o1 + o2;
                String order2 = o2 + o1;
                
                return order2.compareTo(order1);
            }
        });
        
        for(int num : numbers) {
            pq.add(String.valueOf(num));
        }
        
        StringBuilder result =  new StringBuilder();
        while(!pq.isEmpty()) {
            result.append(pq.poll());
        }
        
        String answer = result.toString();
        
        if(answer.charAt(0) == '0') {
            return "0";
        }
        
        return answer;
    }
    
    
}
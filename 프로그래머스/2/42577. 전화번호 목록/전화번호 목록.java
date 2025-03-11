import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length - 1; i++) {
            String p1 = phone_book[i];
            String p2 = phone_book[i+1];
            if(p2.startsWith(p1)) return false;                
        }
        
        return answer;
    }
}
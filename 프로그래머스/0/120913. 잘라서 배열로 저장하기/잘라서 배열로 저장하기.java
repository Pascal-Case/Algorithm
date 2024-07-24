import java.util.Arrays;
class Solution {
    public String[] solution(String my_str, int n) {
        StringBuilder sb = new StringBuilder();
        
        int cnt = 1;
        int i = 0;
        while(true) {
            if(i == my_str.length()) break;
            if(cnt > n) {
                sb.append(" ");
                cnt = 1;
            } else {
                sb.append(my_str.charAt(i++));
                cnt++;
            }
        }
        
        return sb.toString().split(" ");
    }
}
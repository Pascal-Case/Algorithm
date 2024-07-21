import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        String str = "";
        for(char c : my_string.trim().toCharArray()) {
            if('a' <= c && c <= 'z') {
                str += String.valueOf(c);
            } else {
                if(str != "") {
                    list.add(str);
                    str = ""; 
                } else {
                    str = "";                    
                }
            }
        }
        list.add(str);
        return list.toArray(String[]::new);
    }
}
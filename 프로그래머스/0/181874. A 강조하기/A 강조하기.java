import java.util.stream.*;
class Solution {
    public String solution(String myString) {
        return myString.chars().mapToObj(c -> {
            if(c == 'a') return "A";
            if('B' <= c && c <= 'Z') return String.valueOf((char) (c - ('A' - 'a')));
            return String.valueOf((char) c);
        }).collect(Collectors.joining());
    }
}
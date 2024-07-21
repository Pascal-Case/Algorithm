import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        
        for(String s : myString.split("x")) {
            list.add(s.length());
        }
        if(myString.endsWith("x")) list.add(0);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
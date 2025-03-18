import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] arr = s.replaceAll("\\{", " ").replaceAll("\\}", " ").trim().split(" , ");
        List<Integer> tuple = new ArrayList<>();
        
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        
        for(String str : arr) {
            String[] sub = str.split(",");
            
            for(String e : sub) {
                int n = Integer.parseInt(e);
                if(!tuple.contains(n)) tuple.add(n);
            }
        }
        
        return tuple.stream().mapToInt(Integer::intValue).toArray();
    }
}
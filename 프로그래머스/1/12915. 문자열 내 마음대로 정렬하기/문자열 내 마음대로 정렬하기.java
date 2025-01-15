import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);
                
                return Character.compare(c1, c2) != 0 ? Character.compare(c1, c2) : s1.compareTo(s2);
            }
        });
        return strings;
    }
}
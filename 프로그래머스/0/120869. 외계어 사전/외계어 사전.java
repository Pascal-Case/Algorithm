import java.util.Arrays;
class Solution {
    public int solution(String[] spell, String[] dic) {
        return (int) Arrays.stream(dic).filter(w -> {
            for(String s : spell) {
                if(w.indexOf(s) == -1) return false;
            }
            return true;
        }).count() == 1 ? 1 : 2;
    }
}
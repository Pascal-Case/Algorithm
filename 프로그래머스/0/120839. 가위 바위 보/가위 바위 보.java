import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        return String.join("", Arrays.stream(rsp.split("")).map(s -> win(s)).toArray(String[]::new));
    }
    public static String win(String rsp) {
        switch(rsp) {
            case "2" -> {
                return "0";
            }
            case "0" -> {
                return "5";
            }
            default -> {
                return "2";
            }
        }
    }
}
import java.util.*;
class Solution {
    public String solution(String s) {
        List<Character> characters = new ArrayList<>();

        for (char c : s.toCharArray()) {
            characters.add(c);
        }

        characters.sort((a, b) -> {
            if (Character.isLowerCase(a) && Character.isUpperCase(b)) {
                return -1; // 소문자가 더 크다
            } else if (Character.isUpperCase(a) && Character.isLowerCase(b)) {
                return 1; // 대문자가 더 작다
            } else {
                // 같은 케이스 내에서는 문자값에 따라 내림차순
                return b - a;
            }
        });

        StringBuilder sortedString = new StringBuilder();
        for (char c : characters) {
            sortedString.append(c);
        }

        return sortedString.toString();
    }
}
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;
class Solution {
    public String solution(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        TreeSet<Character> treeSet = new TreeSet<>();

        for (char c : s.toCharArray()) {
            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        for (Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                treeSet.add(entry.getKey());
            }
        }

        StringBuilder answer = new StringBuilder();
        while (!treeSet.isEmpty()) {
            answer.append(treeSet.pollFirst());
        }

        return answer.toString();
    }
}
import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> combination = new HashMap<>();
        for (String[] clothe : clothes) {
            String key = clothe[1];
            if (combination.containsKey(key)) {
                combination.put(key, combination.get(key) + 1);
            } else {
                combination.put(key, 1);
            }
        }
        return combination.values().stream().reduce(1, (acc, cur) -> (cur + 1) * acc) - 1;
    }
}
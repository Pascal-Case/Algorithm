class Solution {
    public int solution(int order) {
        return (int) String.valueOf(order).chars().filter(s -> Character.getNumericValue(s) == 3 || Character.getNumericValue(s) == 6 || Character.getNumericValue(s) == 9).count();
    }
}
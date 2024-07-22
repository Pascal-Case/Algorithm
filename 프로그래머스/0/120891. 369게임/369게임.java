class Solution {
    public int solution(int order) {
        System.out.println(String.valueOf(order).replaceAll("[369]^", ""));
        return String.valueOf(order).replaceAll("[^369]", "").length();
    }
}
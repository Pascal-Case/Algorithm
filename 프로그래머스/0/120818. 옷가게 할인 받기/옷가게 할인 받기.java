class Solution {
    public int solution(int price) {
        if(price >= 500_000) return (int) (0.8 * price);
        if(price >= 300_000) return (int) (0.9 * price);
        if(price >= 100_000) return (int) (0.95 * price);
        return price;
    }
}
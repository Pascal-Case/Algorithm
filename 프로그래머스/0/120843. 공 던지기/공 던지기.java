class Solution {
    public int solution(int[] numbers, int k) {
        int idx = 0;
        int count = 1;
        while(count != k) {
            idx = (idx + 2) % numbers.length;
            count++;
        }
        
        return numbers[idx];
    }
}
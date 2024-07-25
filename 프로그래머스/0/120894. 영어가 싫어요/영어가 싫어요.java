class Solution {
    public long solution(String numbers) {
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int idx = 0;
        for(String num : nums) {
            numbers = numbers.replaceAll(num, String.valueOf(idx++));
        }
        
        return Long.parseLong(numbers);
    }
}
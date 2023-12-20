class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] alphabet = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < alphabet.length; i++) {
            String alpha = alphabet[i];
            if (s.contains(alpha)) {
                s = s.replace(alpha, Integer.toString(i));
            }

        }
        return Integer.parseInt(s);
    }
}
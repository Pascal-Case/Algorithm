class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int round = 0;
        while(!s.equals("1")) {
            String temp = s;
            s = s.replaceAll("0", "");
            cnt += temp.length() - s.length();
            s = Integer.toString(s.length(), 2);
            round++;
        }
        
        return new int[]{round, cnt};
    }
}
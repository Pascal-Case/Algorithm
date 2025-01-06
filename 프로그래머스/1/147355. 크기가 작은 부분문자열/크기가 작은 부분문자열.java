class Solution {
    public int solution(String t, String p) {
        int answer = 0;
           
        int tLen = t.length();
        int pLen = p.length();
        long b = Long.parseLong(p);
        
        for(int i = 0; i + p.length() <= t.length(); i++) {
            long a = Long.parseLong(t.substring(i, i + p.length()));
            if(a <= b) {
                answer++;   
            }
        }
        
        return answer;
    }
}
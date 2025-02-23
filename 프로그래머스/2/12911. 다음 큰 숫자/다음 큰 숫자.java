class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt1 = cnt(n);
        
        while(true) {
            if(cnt1 == cnt(++n)){
                break;
            }
        }
        
        return n;
    }
    
    public static int cnt(int n) {
        int cnt = 0;
        char[] arr = Integer.toString(n, 2).toCharArray();
        
        for(char c : arr) {
            if(c == '1') cnt++;
        }
        return cnt;
    }
}
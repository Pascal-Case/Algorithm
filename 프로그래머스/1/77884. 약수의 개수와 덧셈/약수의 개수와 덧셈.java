class Solution {
    public static boolean isPrime(int n) {
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;
        
        if(n % 2 == 0) return false;
        
        for(int i = 3; i <= (int) Math.sqrt(n); i+=2) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public static boolean check(int n) {
        if(isPrime(n)) return true;
        
        int cnt = 1;
        
        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0) cnt++;
        }
        return cnt %2 == 0 ? true : false;
    }
    
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            answer = answer + (check(i) ? i : -i);
        }
        
        return answer;
    }
    
}
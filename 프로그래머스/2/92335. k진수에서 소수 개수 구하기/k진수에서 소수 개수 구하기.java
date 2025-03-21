class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String[] arr = Long.toString(n, k).split("0");
        
        for(String s : arr) {
            if(s.equals("") || s.equals(" ")) continue;
            if(isPrime(Long.parseLong(s))) answer++;   
        }
        return answer;
    }
    
    public static boolean isPrime(Long n) {
        if(n <= 1) return false;
        if(n == 2) return true;
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}
class Solution {
    public int solution(int a, int b) {
        int GCD = gcd(a, b);
        a = a / GCD;
        b = b / GCD;
        
        int x, y;
        while(true) {
            if(b == 1) break;
            if(b % 2 != 0 && b % 5 != 0) return 2;
            
            b = b % 2 == 0 ? b / 2 : b / 5;
        }
        
        return 1;
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
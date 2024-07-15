class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int a = (numer1 * denom2) + (numer2 * denom1);
        int b = denom1 * denom2;
        
        int GCD = gcd(a,b);
    
        return new int[]{a / GCD, b / GCD};
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}
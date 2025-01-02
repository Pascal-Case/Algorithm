class Solution {
    public long solution(long n) {
        
        long sqt = (long) Math.sqrt(n);
        
        if((long) Math.pow(sqt, 2) == n) {
            return (long) Math.pow(sqt+1, 2);
        }
        
        return -1;
    }
}
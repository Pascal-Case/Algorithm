class Solution {
    public int solution(int[] array) {
        int[] frequency = new int[1000];
        
        int f1 = Integer.MIN_VALUE;
        int f1Elem = 0;
        int f2 = Integer.MIN_VALUE;
        int answer = 0;
        
        for(int n : array) {
            frequency[n]++;
        }
        
        for(int i = 0; i < frequency.length; i++) {
            int f = frequency[i];
            if(f == 0) continue;
            
            if(f >= f1) {
                f2 = f1;
                f1 = f;
                f1Elem = i;
            }
        }
        
        if(f1 == f2) return -1;
        
        return f1Elem;
    }
}
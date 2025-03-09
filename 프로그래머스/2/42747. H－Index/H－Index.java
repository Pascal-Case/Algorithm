class Solution {
    public int solution(int[] citations) {
        int h = 0;
        int hMax = citations.length;
        int hMin = hMax % 2 == 0 ? hMax / 2 : hMax / 2 + 1;
        
        for(int i = hMax ; i >= hMin; i--) {
            int count = 0;
            
            for(int c : citations) {
                if(c >= i) count++;   
            }
            
            if(count >= i){
                h = i;
                break;
            }
                
        }
        
        return h;
    }
}
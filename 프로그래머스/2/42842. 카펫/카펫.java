class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int row = brown + yellow; row > 2; row--) {
            
            if((brown + yellow) % row == 0) {
                int col = (brown + yellow) / row;
                
                int b = (row * 2) + ((col - 2) * 2);
                int y = ((row - 2) * (col - 2));
                if(brown == b && yellow == y) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }
        
        return answer;
    }
}
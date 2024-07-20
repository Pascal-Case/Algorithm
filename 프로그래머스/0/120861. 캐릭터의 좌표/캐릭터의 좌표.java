class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        
        int xRange = (board[0] - 1) / 2;
        int yRange = (board[1] - 1) / 2;
        
        for(String cmd : keyinput) {

            switch(cmd) {
                case "left" -> {
                    x = x - 1 >= -xRange ? x - 1 : x;
                    break;
                }
                case "right" -> {
                    x = x + 1 <= xRange ? x + 1 : x;
                    break;
                }
                case "up" -> {
                    y = y + 1 <= yRange ? y + 1 : y;
                    break;
                }
                case "down" -> {
                    y = y - 1 >= -yRange ? y - 1 : y;
                    break;
                }
            }
        }
        
        return new int[]{x, y};
    }
}
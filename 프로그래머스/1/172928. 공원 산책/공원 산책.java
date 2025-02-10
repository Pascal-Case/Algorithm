class Solution {
    public int[] solution(String[] park, String[] routes) {
        String[][] board = new String[park.length][park[0].length()];
        // N S W E
        int[][] dxdy = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        
        int[] answer = new int[2];
        int[] start = new int[2];
        
        for(int i = 0; i < park.length; i++) {
            if(park[i].indexOf("S") != -1) {
                start[0] = i;
                start[1] = park[i].indexOf("S");
            }
            board[i] = park[i].split("");
        }
        
        
        for(String route : routes) {
            String dir = route.split(" ")[0];
            
            int dx = 0;
            int dy = 0;
            
            switch(dir) {
                case "N" -> {
                    dx = dxdy[0][0];
                    dy = dxdy[0][1];
                }
                case "S" -> {
                    dx = dxdy[1][0];
                    dy = dxdy[1][1];
                }
                case "W" -> {
                    dx = dxdy[2][0];
                    dy = dxdy[2][1];
                }
                case "E" -> {
                    dx = dxdy[3][0];
                    dy = dxdy[3][1];
                }
            }
            
            int count = Integer.parseInt(route.split(" ")[1]);
            
            int nx = start[0];
            int ny = start[1];
            while(count > 0) {
                nx = nx + dx;
                ny = ny + dy;
                
                if(nx >= 0 && nx < board.length 
                   && ny >= 0 && ny < board[0].length 
                   && !board[nx][ny].equals("X")) {
                    count--;
                } else {
                    nx = start[0];
                    ny = start[1];
                    break;
                }
            }
            start[0] = nx;
            start[1] = ny;
        }
   
        return start;
    }
}
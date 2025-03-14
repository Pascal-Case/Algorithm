import java.util.*;
class Solution {
    public int solution(String dirs) {
        Set<String> set = new HashSet<>();
        int answer = 0;
        String[] direction = dirs.split("");
        int[] points = {0, 0};
        
        for(String dir : direction) {
            int[] dxdy = move(dir);
            int x = points[0];
            int y = points[1];
            int nx = x + dxdy[0];
            int ny = y + dxdy[1];
            
            if(nx >= -5 && nx <= 5 && ny >= -5 && ny <= 5) {
                String d1 = dir + Integer.toString(x) + Integer.toString(y);
                String d2 = opposite(dir) + Integer.toString(nx) + Integer.toString(ny);
                if(!set.contains(d2)) set.add(d1);
                points[0] = nx;
                points[1] = ny;
            }
        }
        
        return set.size();
    }
    
    public static String opposite(String dir) {
        String o = "";
        switch(dir) {
            case "U" :
                o = "D";
                break;
            case "D" :
                o = "U";
                break;
            case "R" :
                o = "L";
                break;
            case "L" :
                o = "R";
                break;
        }
        return o;
    }
    
    public static int[] move(String dir) {
        int dx = 0;
        int dy = 0;
        switch(dir) {
            case "U" :
                dx = -1;
                dy = 0;
                break;
            case "D" :
                dx = 1;
                dy = 0;
                break;
            case "R" :
                dx = 0;
                dy = 1;
                break;
            case "L" :
                dx = 0;
                dy = -1;
                break;
        }
        
        return new int[]{dx, dy};
    }
}
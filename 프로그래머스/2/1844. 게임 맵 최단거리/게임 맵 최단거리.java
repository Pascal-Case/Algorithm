import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        if(maps[0][0] == 0) return -1;
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int steps = cur[2];
            
            if(x == n - 1 && y == m - 1) return steps;
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(visited[nx][ny]) continue;
                if(maps[nx][ny] == 0) continue;
                
                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny, steps + 1});
            }
        }
        
        return -1;
    }
}
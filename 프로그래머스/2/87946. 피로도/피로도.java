class Solution {
    public static int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, 0, 0, dungeons, visited);
        return answer;
    }
    
    public static void dfs(int k, int idx, int count, int[][] dungeons, boolean[] visited) {
        if(idx == dungeons.length) {
            answer = Math.max(answer, count);
            return;
        }
        for(int i = 0; i < dungeons.length; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            int[] dungeon = dungeons[i];
            int need = dungeon[0];
            int use = dungeon[1];
            if(k >= need) {
                dfs(k - use, idx + 1, count + 1, dungeons, visited);
            } else {
                dfs(k, idx + 1, count, dungeons, visited);
            }
            visited[i] = false;
        }
        
    }
}
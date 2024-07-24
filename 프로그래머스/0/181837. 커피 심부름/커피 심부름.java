class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String s : order) {
            answer += menu(s);
        }
        return answer;
    }
    
    public static int menu(String s) {
        if(s.contains("americano") || s.contains("anything")) return 4500;
        return 5000;
    }
}
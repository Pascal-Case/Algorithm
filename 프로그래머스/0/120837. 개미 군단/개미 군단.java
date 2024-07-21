class Solution {
    public int solution(int hp) {
        int answer = 0;
        int mod = 5;
        while(hp > 0) {
            answer += hp / mod;
            hp = hp % mod;
            mod -= 2;
        }
        return answer;
    }
}
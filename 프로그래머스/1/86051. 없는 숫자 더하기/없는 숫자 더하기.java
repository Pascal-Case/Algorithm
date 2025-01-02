class Solution {
    public int solution(int[] numbers) {
        boolean[] check = new boolean[10];
        int answer = 0;
        for(int num : numbers) {
            check[num] = true;
        }
        for(int i = 0; i < 10; i++) {
            if(!check[i]) answer += i;
        }
        return answer;
    }
}
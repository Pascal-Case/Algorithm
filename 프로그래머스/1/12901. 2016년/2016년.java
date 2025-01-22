class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int cnt = b - 1;
        for(int i = 1; i < a; i++) {
            cnt += month[i];
        }

        return days[((cnt % 7) + 5) % 7];
    }
}
class Solution
{
    public int solution(int n, int a, int b)
    {
        int round = 1;
        while(true) {
            if(nextNum(a) == nextNum(b)) {
                break;
            }
            a = nextNum(a);
            b = nextNum(b);
            round++;
        }
        return round;
    }
    public static int nextNum(int n) {
        return n % 2 == 0 ? n / 2 : n / 2 + 1;
    }
}
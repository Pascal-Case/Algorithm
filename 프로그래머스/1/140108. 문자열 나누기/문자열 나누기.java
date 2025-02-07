class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char[] arr = s.toCharArray();
        
        char x = arr[0];
        int xCnt = 1;
        int yCnt = 0;
        
        for(int i = 1; i < arr.length; i++) {
            char cur = arr[i];
            
            // 분해 완료 & 새로운 x 선정
            if(xCnt == yCnt) {
                answer++;
                x = arr[i];
                xCnt = 1;
                yCnt = 0;
                continue;
            }
            
            if(cur == x) {
                xCnt++;
            } else {
                yCnt++;
            }
        }
        
        return answer + 1;
    }
}
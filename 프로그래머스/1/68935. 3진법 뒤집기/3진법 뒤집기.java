class Solution {
    public int solution(int n) {
        int answer = 0;
        String sam = "";
        
        while(n > 0) {
            sam += n % 3;
            n /= 3;
        }
        
        String[] arr = sam.split("");
        
        for(int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]) * Math.pow(3, arr.length - 1 - i);
        }
        
        return answer;
    }
}
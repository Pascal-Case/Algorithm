class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            char cur = arr[i];
            int idx = -1;
            
            for(int j = 0; j < i; j++) {
                if(cur == arr[j]) {
                    idx = i - j;
                }
            }
            
            answer[i] = idx;
        }
        
        return answer;
    }
}
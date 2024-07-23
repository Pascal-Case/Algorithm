class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return arr;
        int[] a = new int[12];
        for(int i = 0; i <= 11; i++) {
            a[i] = 2 << (i - 1);
        }
        
        int n = 0;
        for(int i = 0 ; i <= 11; i ++) {
            if(arr.length == a[i]) {
                return arr;
            } else if(arr.length < a[i]) {
                n = a[i];
                break;
            }
        }
        int[] answer = new int[n];
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}
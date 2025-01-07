class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        int wordCnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != ' ') {
                if(wordCnt %2 ==0) {
                    arr[i] = Character.toUpperCase(arr[i]);    
                    wordCnt ++;
                } else {
                    arr[i] = Character.toLowerCase(arr[i]);    
                    wordCnt ++;
                }
                
            } else {
                wordCnt = 0;
            }
        }
        
        return new String(arr);
    }
}
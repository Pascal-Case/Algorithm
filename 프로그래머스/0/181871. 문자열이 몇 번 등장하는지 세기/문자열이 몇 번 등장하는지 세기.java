class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        while(true) {
            if(myString.contains(pat)) {
                answer++;
                myString = myString.substring(myString.indexOf(pat) + 1);
            } else {
                break;
            }
        }
        
        return answer;
    }
}
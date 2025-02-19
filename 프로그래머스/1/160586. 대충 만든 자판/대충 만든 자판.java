import java.util.Arrays;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] alphabet = new int[26];
        int[] answer = new int[targets.length];
        
        Arrays.fill(alphabet, Integer.MAX_VALUE);
        
        for(String key: keymap) {
            char[] arr = key.toCharArray();
            int count = 1;
            for(char c : arr) {
                int idx = c - 'A';
                alphabet[idx] = Math.min(alphabet[idx], count);
                count++;
            }
        }
        
        for(int i = 0; i < targets.length; i++) {
            char[] arr = targets[i].toCharArray();
            
            for(char c : arr) {
                int idx = c - 'A';
                
                if(alphabet[idx] == Integer.MAX_VALUE) {
                    answer[i] = -1;
                    break;
                }
                
                answer[i] += alphabet[idx];
                
                
            }
            
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String before, String after) {
        int[] arr1 = new int['z' - 'a' + 1];
        int[] arr2 = new int['z' - 'a' + 1];
        
        for(char c : before.toCharArray()) {
            arr1[c - 'a']++;
        }
        for(char c : after.toCharArray()) {
            arr2[c - 'a']++;
        }
        
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) return 0;
        }
        
        return 1;
    }
}
import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        
        for(int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        
        int[] arr = new int[map.size()];
        
        int idx = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr[idx] = entry.getValue();
            idx++;
        }
        
        Arrays.sort(arr);
        
        for(int i = arr.length-1; i >= 0; i--) {
            if(k > 0 && arr[i] > 0) {
                k -= arr[i];
                answer++;
            }
        }
        
        return answer;
    }
}
import java.util.Arrays;
import java.util.stream.IntStream;
class Solution {
    public static int N = 0;
    
    public int solution(int n, int[][] q, int[] ans) {
        N = n;
        int[] nums = IntStream.rangeClosed(1, n).toArray();
        int answer = 0;
        
        for(int i1 = 0; i1 <= n-5; i1++) {
            for(int i2 = i1+1; i2 <= n-4; i2++) {
                for(int i3 = i2+1; i3 <= n-3; i3++) {
                    for(int i4 = i3+1; i4 <= n-2; i4++) {
                        for(int i5 = i4+1; i5 <= n-1; i5++) {
                            int[] arr1 = {nums[i1], nums[i2], nums[i3], nums[i4], nums[i5]};
                            
                            boolean flag = true;
                            for(int i = 0; i < q.length; i++) {
                                int[] arr2 = q[i];
                                
                                if(func(arr1, arr2) != ans[i]) {
                                    flag = false;
                                    break;
                                }
                            }
                            
                            if(flag) answer++;
                            
                        }
                    }
                }
            }
        }
        
        
        
        return answer;
    }
    
    public static int func(int[] arr1, int[] arr2) {
        int[] visited = new int[N +1];
        
        for(int i = 0; i < 5; i++) {
            visited[arr1[i]]++;
            visited[arr2[i]]++;
        }
        
        return (int) Arrays.stream(visited).filter(i -> i == 2).count();
        
    }
}
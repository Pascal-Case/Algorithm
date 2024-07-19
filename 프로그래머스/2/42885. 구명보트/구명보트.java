import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
    
        int left = 0;
        int right = people.length - 1;
        
        while(left <= right) {
            if(left == right) {
                answer++;
                break;
            }
            
            if(people[right] + people[left] <= limit) {
                left++;
                right--;
                answer++;
            } else {
                right--;
                answer++;
            }
            
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int n, int w, int num) {
        int[][] stack = new int[w][n / w + 1];
        int answer = 0;
        int flore = num / 6;
        
        int idx = 1;
        int i = 0;
        int j = 0;
        boolean right = true;
        while(idx <= n) {
            
            stack[i][j] = idx++;
            
            if(right) {
                i++;
            } else {
                i--;
            }
            
            if(i == w) {
                i = w - 1;
                j++;
                right = false;
            } else if(i < 0) {
                i = 0;
                j++;
                right = true;
            }
            
        }
        
        for(int k = 0; k < stack.length; k++) {
            for(int m = 0; m < stack[k].length; m++) {
                System.out.print(stack[k][m] + " ");
                if(stack[k][m] == num) {
                    for(int t = stack[k].length - 1; t >= 0; t--) {
                           if(stack[k][t] != 0) {
                               answer++;
                               
                               if(stack[k][t] == stack[k][m] ) return answer;
                               
                           }
                    }    
                }
            }                                       
            System.out.println();
        }
        
        
        return answer;
    }
}
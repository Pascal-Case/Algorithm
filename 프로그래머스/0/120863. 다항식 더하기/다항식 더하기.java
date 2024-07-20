class Solution {
    public String solution(String str) {
        int a = 0;
        int b = 0;
        
        String[] arr = str.split(" ");
        
        for(String s : arr) {
            if("+".equals(s)) continue;
            
            if(s.indexOf("x") != -1) {
                if(s.startsWith("x")) {
                    a++;
                } else {
                    a += Integer.parseInt(s.split("x")[0]);
                }
            } else {
                b += Integer.parseInt(s);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if(a != 0) sb.append(a == 1 ? "" : a).append("x");
        
        if(b > 0) {
            sb.append(a == 0 ? "" : " + ").append(b);
        }
        return sb.toString();
    }
}
class Solution {
    public String solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ra = new StringBuilder(a).reverse();
        StringBuilder rb = new StringBuilder(b).reverse();
        
        int up = 0;
        for(int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int ca = ra.length() > i ? Character.getNumericValue(ra.charAt(i)) : 0;
            int cb = rb.length() > i ? Character.getNumericValue(rb.charAt(i)) : 0;
            int sum = up + ca + cb;
            if(sum / 10 >= 1) {
                up = 1;
            } else {
                up = 0;
            }
            sb.append(sum % 10);
        }
        if(up == 1) {
            sb.append(1);
        }
        
        
        return sb.reverse().toString();
    }
}
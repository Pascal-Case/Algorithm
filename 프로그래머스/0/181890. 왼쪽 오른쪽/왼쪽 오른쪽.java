import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
        StringBuilder sb = new StringBuilder();
        
        int start = 0;
        int end = str_list.length;
        for(int i = 0; i < str_list.length; i++) {
            if("l".equals(str_list[i])) {
                end = i;
                break;
            } else if("r".equals(str_list[i])) {
                start = i + 1;
                break;
            }
        }
        if(start == end || (start == 0 && end == str_list.length)) return new String[]{};
        return Arrays.copyOfRange(str_list, start, end);
    }
}
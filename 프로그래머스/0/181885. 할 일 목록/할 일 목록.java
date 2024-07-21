import java.util.stream.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        return IntStream.rangeClosed(1, todo_list.length).filter(i -> !finished[i - 1])
            .mapToObj(j -> todo_list[j - 1]).toArray(String[]::new);
    }
}
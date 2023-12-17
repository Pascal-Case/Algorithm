import java.util.LinkedList;
class Solution {
    public static int solution(int[] priorities, int location) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int priority : priorities) {
            list.add(priority);
        }

        int count = 0;
        while (true) {
            boolean isHighPriority = true;
            int cur = list.pollFirst();

            for (int priority : list) {
                if (priority > cur) {
                    isHighPriority = false;
                    break;
                }
            }

            if (isHighPriority) {
                count++;
                if (location == 0) {
                    break;
                }
            } else {
                list.addLast(cur);
                if (location == 0) {
                    location = list.size();
                }
            }
            location--;
        }

        return count;
    }
}
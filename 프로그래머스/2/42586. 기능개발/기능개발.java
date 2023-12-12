import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        LinkedList<Integer> queue = new LinkedList<>();
        LinkedList<Integer> speedsQueue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        int day = 0;

        for (int progress : progresses) {
            queue.offer(progress);
        }
        for (int speed : speeds) {
            speedsQueue.offer(speed);
        }

        while (!queue.isEmpty()) {
            int speed = speedsQueue.peekFirst();
            int currentProgress = queue.peekFirst() + (day * speed);

            int count = 0;
            while (currentProgress < 100) {
                currentProgress += speed;
                day++;
            }

            queue.pollFirst();
            speedsQueue.pollFirst();
            count++;

            while (!queue.isEmpty()) {
                int nextSpeed = speedsQueue.peekFirst();
                int nextProgress = queue.peekFirst() + (day * nextSpeed);
                if (nextProgress >= 100) {
                    queue.pollFirst();
                    speedsQueue.pollFirst();
                    count++;
                } else {
                    break;
                }
            }
            answer.add(count);
        }

        return answer;
    }
}
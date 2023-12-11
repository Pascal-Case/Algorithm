
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        boolean isPureSequence = false;

        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(sc.next()));
        }

        List<Stack<Integer>> stacks = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            stacks.add(new Stack<>());
        }

        for (int data : numbers) {

            for (int i = 0; i < stacks.size(); i++) {
                Stack<Integer> stack = stacks.get(i);
                if (stack.empty() || stack.peek() < data) {
                    stack.push(data);
                    isPureSequence = true;
                    break;
                } else if (i == stacks.size() - 1) {
                    isPureSequence = false;
                    break;
                }

            }

            if (!isPureSequence) {
                break;
            }

        }

        System.out.println(isPureSequence ? "YES" : "NO");


    }
}

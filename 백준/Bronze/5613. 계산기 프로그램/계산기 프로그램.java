
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> numbers = new ArrayDeque<>();
        Queue<String> operator = new LinkedList<>();
        int result = 0;
        while (sc.hasNext()) {
            String next = sc.nextLine();
            if (next.equals("=")) {
                break;
            } else if (next.equals("+") || next.equals("-") || next.equals("*") || next.equals("/")) {
                operator.add(next);
            } else {
                numbers.add(Integer.parseInt(next));
            }
        }

        result = numbers.pollFirst();
        while (!operator.isEmpty()) {
            String op = operator.poll();
            int num = numbers.poll();

            switch (op) {
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    result /= num;
                    break;
            }
        }

        System.out.println(result);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int recursiveCount = 0;
    public static int dpCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        fib1(n);
        fib2(n);
        System.out.println(recursiveCount + " " + dpCount);
    }

    public static int fib1(int n) {
        if (n <= 2) {
            recursiveCount++;
            return 1;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    public static int fib2(int n) {
        int[] fibonacci = new int[n + 1];
        fibonacci[1] = 1;
        fibonacci[2] = 1;

        for (int i = 3; i <= n; i++) {
            dpCount++;
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci[n];
    }

}

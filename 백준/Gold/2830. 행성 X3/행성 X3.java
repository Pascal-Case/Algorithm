import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] X3 = new int[N];
        for (int i = 0; i < N; i++) {
            X3[i] = Integer.parseInt(br.readLine());
        }

        long sum = 0;
        for (int i = 0; i < 32; i++) {
            int countOnes = 0;
            for (int j = 0; j < N; j++) {
                if ((X3[j] & (1 << i)) != 0) {
                    countOnes++;
                }
            }

            sum += (long) countOnes * (N - countOnes) * (1 << i);

        }

        System.out.println(sum);

    }
}

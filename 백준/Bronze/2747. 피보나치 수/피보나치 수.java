import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] f = new int[n + 2];

        if (n == 0) {
            System.out.println(0);
            return;
        }
        
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }

        System.out.println(f[n]);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[][] dp = new int[N][3];

        int R = 0;
        int G = 1;
        int B = 2;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            dp[0][i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int costR = Integer.parseInt(st.nextToken());
            int costG = Integer.parseInt(st.nextToken());
            int costB = Integer.parseInt(st.nextToken());

            dp[i][R] = costR + Math.min(dp[i - 1][G], dp[i - 1][B]);
            dp[i][G] = costG + Math.min(dp[i - 1][R], dp[i - 1][B]);
            dp[i][B] = costB + Math.min(dp[i - 1][R], dp[i - 1][G]);
        }

        System.out.println(Math.min(Math.min(dp[N - 1][R], dp[N - 1][G]), dp[N - 1][B]));
    }
}

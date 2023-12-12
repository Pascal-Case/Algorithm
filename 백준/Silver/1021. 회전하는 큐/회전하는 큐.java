
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());    // 큐의 크기(1 ~ N)
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            int idx = queue.indexOf(arr[i]);
            int middle;

            if (queue.size() % 2 == 0) {
                middle = queue.size() / 2 - 1;
            } else {
                middle = queue.size() / 2;
            }

            if (idx <= middle) {
                for (int j = 0; j < idx; j++) {
                    int temp = queue.pollFirst();
                    queue.offerLast(temp);
                    cnt++;
                }
            } else {
                for (int j = 0; j < queue.size() - idx; j++) {
                    int temp = queue.pollLast();
                    queue.offerFirst(temp);
                    cnt++;
                }
            }
            queue.pollFirst();
        }
        System.out.println(cnt);
    }

}

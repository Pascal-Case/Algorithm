
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = 1;
        while (!list.isEmpty()) {
            int num = list.pollFirst();
            if (index % K == 0) {
                result.add(num);
            } else {
                list.addLast(num);
            }
            index++;
        }

        System.out.print("<");
        for (int i = 0; i < result.size() - 1; i++) {
            System.out.print(result.get(i) + ", ");
        }
        System.out.print(result.get(result.size() - 1) + ">");


    }
}

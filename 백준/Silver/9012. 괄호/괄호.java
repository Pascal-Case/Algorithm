import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            arrayList.add(br.readLine());
        }

        for (int i = 0; i < T; i++) {
            String str = arrayList.get(i);
            Deque<String> stack = new ArrayDeque<>();
            boolean isVPS = true;

            for (String s : str.split("")) {
                if (s.equals("(")) {
                    stack.push(s);
                } else {
                    if (stack.isEmpty()) {
                        isVPS = false;
                        break;
                    } else {
                        stack.pop();
                    }

                }
            }
            if (isVPS) {
                if (stack.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }

        }

    }
}

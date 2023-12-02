import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder answer = new StringBuilder();
        for(char x : str.toCharArray()) {
            if(97 <= x && x <= 122) {
                answer.append((char) (x - 32));
            } else {
                answer.append((char) (x + 32));
            }
        }
        System.out.println(answer);
        
    }
}
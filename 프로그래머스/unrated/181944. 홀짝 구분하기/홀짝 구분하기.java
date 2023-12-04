import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result;
        if(n %2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }
        System.out.printf("%d is %s", n, result);
        
        
    }
}
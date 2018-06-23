import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int fibonacci = 0;
        int firstNum = 1;
        int secondNum = 1;
        if (n == 0 || n == 1) {
            System.out.println("1");
        } else {
            for (int i = 2; i <= n; i++) {
                fibonacci = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = fibonacci;
            }
            System.out.println(fibonacci);
        }
    }
}

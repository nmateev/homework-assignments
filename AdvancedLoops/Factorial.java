import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int factorial = 1;
        for (int i = 1; i <=n ; i++) {
            factorial *=i;
        }
        System.out.println(factorial);
    }
}

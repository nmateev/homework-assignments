import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int sum = 0;
        while (n > 0) {
            int reminder = n % 10;
            sum += reminder;
            n /= 10;
        }
        System.out.println(sum);
    }
}

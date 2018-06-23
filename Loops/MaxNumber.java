import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(in.readLine());
            if (number > max) {
                max = number;
            }

        }
        System.out.println(max);
    }
}


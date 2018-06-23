import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualPairs {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int sum = 0;
        int previousSum = 0;
        int maxDiff = 0;
        int firstSum = 0;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                int number = Integer.parseInt(in.readLine());
                int number2 = Integer.parseInt(in.readLine());
                firstSum = number + number2;
            } else if (n == 2) {
                int number = Integer.parseInt(in.readLine());
                int number2 = Integer.parseInt(in.readLine());
                sum = number + number2;
                maxDiff = Math.abs(firstSum - sum);
            } else {
                int number = Integer.parseInt(in.readLine());
                int number2 = Integer.parseInt(in.readLine());
                sum = number + number2;
                if (i >= 2 && (sum != previousSum)) {

                    maxDiff = Math.abs(previousSum - sum);
                }
            }
            previousSum = sum;
        }
        if (maxDiff == 0) {
            System.out.println("Yes, value=" + firstSum);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}

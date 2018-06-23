import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenSum {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(in.readLine());
            if (i % 2 == 0) {
                oddSum += number;
            } else {
                evenSum += number;
            }

        }
        int difference = Math.abs(oddSum - evenSum);
        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + oddSum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }
    }
}


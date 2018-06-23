import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftAndRightSum {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < n * 2; i++) {
            int number = Integer.parseInt(in.readLine());
            if (i < n) {
                leftSum += number;
            } else {
                rightSum += number;
            }

        }
        int difference = Math.abs(leftSum - rightSum);
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " + leftSum);
        } else {
            System.out.println("No, diff = " + difference);
        }
    }
}


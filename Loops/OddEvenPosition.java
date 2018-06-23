import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenPosition {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        double oddSum = 0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double evenSum = 0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(in.readLine());
            if (i % 2 == 0) {
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
            } else {
                evenSum += number;
                if (number < evenMin) {
                    evenMin = number;
                }
                if (number > evenMax) {
                    evenMax = number;
                }
            }

        }
        if (oddSum == (int) oddSum) {
            System.out.println("OddSum=" + (int) oddSum + ",");
        } else {
            System.out.println("OddSum=" + oddSum + ",");
        }
        if (oddMin == 1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
            if (oddMin == (int) oddMin) {
                System.out.println("OddMin=" + (int) oddMin + ",");
            } else {
                System.out.println("OddMin=" + oddMin + ",");
            }
        }
        if (oddMax == -1000000000.0) {
            System.out.println("OddMax=No,");
        } else {
            if (oddMax == (int) oddMax) {
                System.out.println("OddMax=" + (int) oddMax + ",");
            } else {
                System.out.println("OddMax=" + oddMax + ",");
            }
        }
        if (evenSum == (int) evenSum) {
            System.out.println("EvenSum=" + (int) evenSum + ",");
        } else {
            System.out.println("EvenSum=" + evenSum + ",");
        }
        if (evenMin == 1000000000.0) {
            System.out.println("EvenMin=No,");
        } else {
            if (evenMin == (int) evenMin) {
                System.out.println("EvenMin=" + (int) evenMin + ",");
            } else {
                System.out.println("EvenMin=" + evenMin + ",");
            }
        }
        if (evenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            if (evenMax == (int) evenMax) {
                System.out.println("EvenMax=" + (int) evenMax);
            } else {
                System.out.println("EvenMax=" + evenMax);
            }
        }
    }
}

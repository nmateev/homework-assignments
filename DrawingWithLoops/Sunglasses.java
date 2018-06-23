import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sunglasses {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        in.close();
        printLine(n);
        printMiddle(n);
        printLine(n);
    }

    public static void printSpace(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    public static void printLine(int n) {
        for (int i = 0; i < n * 2; i++) {
            System.out.print("*");
        }
        printSpace(n);
        for (int m = 0; m < n * 2; m++) {
            System.out.print("*");
        }
    }

    public static void printMiddle(int n) {
        System.out.println();
        for (int row = 0; row < n - 2; row++) {
            System.out.print("*");
            for (int left = 0; left < (n * 2) - 2; left++) {
                System.out.print("/");
            }
            System.out.print("*");
            if (row == ((n - 1) / 2) - 1) {
                for (int i = 0; i < n; i++) {
                    System.out.print("|");
                }
            } else {
                printSpace(n);
            }

            System.out.print("*");
            for (int right = 0; right < (n * 2) - 2; right++) {
                System.out.print("/");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}

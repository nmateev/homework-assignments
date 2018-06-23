import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RhombusOfStars {
    public static void main(String[] args) throws IOException {
        System.gc();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        in.close();
        if (n == 1) {
            System.out.println("*");
        } else {
            printFirst(n);
            printBottom(n);
        }
    }

    public static void printFirst(int n) {
        String space = " ";
        for (int row = 0; row < n - 1; row++) {
            for (int spaceNum = n - row; spaceNum > 1; spaceNum--) {
                System.out.print(space);
            }
            System.out.print("*");
            for (int i = 0; i < row; i++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void printBottom(int n) {
        String space = " ";
        for (int row = 0; row < n; row++) {
            for (int spaceNum = 0; spaceNum < row; spaceNum++) {
                System.out.print(space);
            }
            System.out.print("*");
            for (int i = 0; i < n - row - 1; i++) {
                System.out.print(" *");
            }
            if (row != n - 1) {
                System.out.println();
            }
        }

    }
}
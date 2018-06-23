import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareFrame {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        in.close();
        printStartAndEnd(n, 0);
        printMiddle(n);
        printStartAndEnd(n, 1);

    }

    public static void printStartAndEnd(int n, int check) {
        System.out.print("+");
        for (int i = 0; i <= n - 3; i++) {
            System.out.print(" -");
        }
        System.out.print(" +");
        if (check == 0) {
            System.out.print(System.getProperty("line.separator"));
        }
    }

    public static void printMiddle(int n) {
        for (int loop = 0; loop < n - 2; loop++) {
            System.out.print("|");
            for (int i = 0; i <= n - 3; i++) {
                System.out.print(" -");
            }
            System.out.print(" |" + System.getProperty("line.separator"));
        }
    }
}

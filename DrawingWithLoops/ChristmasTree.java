import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChristmasTree {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        in.close();
        printTop(n);
        printRest(n);

    }
     public static void printTop(int n){
        for (int i = 0; i <= n; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
    }
    public static void printRest(int n){
        for (int row = 0; row < n ; row++) {
            for (int space = n-2; space >=row ; space--) {
                System.out.print(" ");
            }
            for (int left = 0; left <=row ; left++) {
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int right = 0; right <=row ; right++) {
                System.out.print("*");
            }
            if (row != n - 1) {
                System.out.println();
            }
        }
    }
}

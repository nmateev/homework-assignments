import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class House {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        short n = Short.parseShort(in.readLine());
        in.close();
        printRoof(n);
        printFoundation(n);

    }

    public static void printRoof(int n) {


        int starCount = 1;
        if (n % 2 == 0) starCount++;
        for (int i = 0; i < (n + 1) / 2; i++) {
            int dashCount = ((n - starCount) / 2);
            System.out.print(wantedLine("-", dashCount));
            System.out.print(wantedLine("*", starCount));
            System.out.println(wantedLine("-", dashCount));
            starCount = starCount + 2;
        }

    }

    public static String wantedLine(String wanted, int loop) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loop; i++) {
            sb.append(wanted);
        }
        return sb.toString();
    }

    public static void printFoundation(int n) {
        if (n == 2) {
            System.out.print("||");
        } else {
            int rows;
            if (n % 2 == 0) {
                rows = n - (n / 2);
            } else {
                rows = (n / 2);
            }
            for (int row = 0; row < rows; row++) {
                System.out.print("|");
                for (int length = 0; length < n - 2; length++) {
                    System.out.print("*");
                }
                System.out.print("|");
                if (row != rows - 1) {
                    System.out.println();
                }
            }
        }
    }
}
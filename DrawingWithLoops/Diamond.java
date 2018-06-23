import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diamond {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        in.close();
        if (n == 1) {
            System.out.println("*");
        } else if (n == 2) {
            System.out.println("**");
        } else {
            int rowCount;
            if (n % 2 == 0) {
                rowCount = n - 1;
            } else {
                rowCount = n;
            }
            beginning(n);
            System.out.println();
            printFirst(n,rowCount);
            printSecond(n,rowCount);
            beginning(n);
        }

    }

    public static String wantedLine(String wanted, int loop) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < loop; i++) {
            sb.append(wanted);
        }
        return sb.toString();
    }

    public static void beginning(int n) {
        int starCount;
        int dashCount = (n - 1) / 2;
        System.out.print(wantedLine("-", dashCount));
        if (n % 2 == 0) {
            starCount = 2;
        } else {
            starCount = 1;
        }
        System.out.print(wantedLine("*", starCount));
        System.out.print(wantedLine("-", dashCount));
    }

    public static void printFirst(int n,int rowCount) {

        int dashCount = ((n - 1) / 2) - 1;
        int midDash = 0;
        for (int i = 0; i <= (rowCount / 2) - 1; i++) {
            System.out.print(wantedLine("-", dashCount));
            System.out.print(wantedLine("*", 1));
            if (n % 2 == 0) {
                System.out.print(wantedLine("-", midDash + 2));
            } else {
                System.out.print(wantedLine("-", midDash + 1));
            }
            System.out.print(wantedLine("*", 1));
            System.out.print(wantedLine("-", dashCount));
            System.out.println();
            dashCount -= 1;
            midDash = midDash + 2;
        }
    }

    public static void printSecond(int n,int rowCount) {

        int dashCount = 1;
        int midDash = n - 4;

        for (int i = (rowCount / 2) - 2; i >= 0; i--) {
            System.out.print(wantedLine("-", dashCount));
            System.out.print(wantedLine("*", 1));
            if (n % 2 == 0) {
                System.out.print(wantedLine("-", midDash));
            } else {
                System.out.print(wantedLine("-", midDash));
            }
            System.out.print(wantedLine("*", 1));
            System.out.print(wantedLine("-", dashCount));
            System.out.println();
            dashCount += 1;
            midDash = midDash - 2;
        }
    }
}



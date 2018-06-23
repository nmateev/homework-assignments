import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fortress {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        in.close();
        System.out.println(printRoof(n));
        printBody(n);
        System.out.println(printLast(n));
        System.out.println(printFoundation(n));
    }

    public static void printBody(int n) {

        for (int i = 0; i < n - 3; i++) {
            System.out.println(bodyLine(n));
        }

    }
    public static String printLast(int n) {

       StringBuilder sb = new StringBuilder();
        int mid = (n * 2) - 4 - (2 * (n / 2));
       sb.append("|");
        for (int i = 0; i < n / 2+1; i++) {
            sb.append(" ");
        }
        for (int i = 0; i <mid; i++) {
            sb.append("_");
        }
        for (int k = 0; k < n / 2+1; k++) {
            sb.append(" ");
        }
        sb.append("|");
        return sb.toString();
    }

    public static String bodyLine(int n) {
        int bodyLength = n * 2;

        StringBuilder sb = new StringBuilder();
        sb.append("|");
        for (int i = 0; i < bodyLength - 2; i++) {
            sb.append(" ");
        }
        sb.append("|");
        return sb.toString();
    }

    public static String printRoof(int n) {

        StringBuilder sb2 = new StringBuilder();
        sb2.append("/");
        for (int i = 0; i < n / 2; i++) {
            sb2.append("^");
        }
        sb2.append("\\");
        if (n < 5) {
            sb2.append("/");
            for (int m = 0; m < n / 2; m++) {
                sb2.append("^");
            }
            sb2.append("\\");
        } else {
            int mid = (n * 2) - 4 - (2 * (n / 2));
            for (int k = 0; k < mid; k++) {
                sb2.append("_");
            }
            sb2.append("/");
            for (int h = 0; h < n / 2; h++) {
                sb2.append("^");
            }
            sb2.append("\\");
        }
        return sb2.toString();
    }

    public static String printFoundation(int n) {

        StringBuilder sb2 = new StringBuilder();
        sb2.append("\\");
        for (int i = 0; i < n / 2; i++) {
            sb2.append("_");
        }
        sb2.append("/");
        if (n < 5) {
            sb2.append("\\");
            for (int m = 0; m < n / 2; m++) {
                sb2.append("_");
            }
            sb2.append("/");
        } else {
            int mid = (n * 2) - 4 - (2 * (n / 2));
            for (int k = 0; k < mid; k++) {
                sb2.append(" ");
            }
            sb2.append("\\");
            for (int h = 0; h < n / 2; h++) {
                sb2.append("_");
            }
            sb2.append("/");
        }
        return sb2.toString();
    }
}

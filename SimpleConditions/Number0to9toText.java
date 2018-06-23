import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number0to9toText {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        if (num < 0 || num > 9) {
            System.out.println("number too big");
        } else {
            if (num < 1) {
                System.out.println("zero");
            } else if (num < 2) {
                System.out.println("one");
            } else if (num < 3) {
                System.out.println("two");
            } else if (num < 4) {
                System.out.println("three");
            } else if (num < 5) {
                System.out.println("four");
            } else if (num < 6) {
                System.out.println("five");
            } else if (num < 7) {
                System.out.println("six");
            } else if (num < 8) {
                System.out.println("seven");
            } else if (num < 9) {
                System.out.println("eight");
            } else{
                System.out.println("nine");
            }
        }
    }
}

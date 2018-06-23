import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterEvenNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        while (true) {
            try {
                in = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(in.readLine());
                if (n % 2 == 0) {
                    System.out.printf("Even number entered: %d", n);
                    break;
                } else {
                    System.out.println("The number is not even.");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number!");
            }
        }
    }
}

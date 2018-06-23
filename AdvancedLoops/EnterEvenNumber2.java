import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterEvenNumber2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while (true) {
            System.out.print("Enter even number: ");
            n = Integer.parseInt(in.readLine());
            if (n % 2 == 0) {
                break;
            }
            System.out.println("The number is not even.");
        }
        System.out.println("Even number entered: " + n);
    }
}

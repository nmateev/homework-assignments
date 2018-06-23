import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(in.readLine());
        int num2 = Integer.parseInt(in.readLine());
        if (num1 > num2) {
            System.out.println("Greater number: " + num1);
        } else {
            System.out.println("Greater number: " + num2);
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeEqualNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(in.readLine());
        int num2 = Integer.parseInt(in.readLine());
        int num3 = Integer.parseInt(in.readLine());
        if (num1 == num2 && num2 == num3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

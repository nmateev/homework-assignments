import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number100to200 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(in.readLine());

        if (input > 200) {
            System.out.println("Greater than 200");
        } else if (input > 99) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println( "Less than 100");
        }

    }
}

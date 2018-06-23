import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualWords {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input =  in.readLine().toLowerCase();
        String input2 =  in.readLine().toLowerCase();

        if (input.equals(input2)) {
            System.out.println("yes");
        }else {
            System.out.println( "no");
        }
    }
}

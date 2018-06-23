import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(in.readLine());
        if (number % 2 == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}

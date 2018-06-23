import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleOfDollars {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        in.close();

        for (int row = 0; row < n ; row++) {
            System.out.print("$");
            for (int col = 0; col <=row -1 ; col++) {
                System.out.print(" $");
            }
            System.out.println();
        }
    }
}

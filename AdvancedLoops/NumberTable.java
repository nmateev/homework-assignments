import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberTable {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int num = row + col + 1;
                if (num > n) {
                    num = (2 * n) - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

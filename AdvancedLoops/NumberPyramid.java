import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberPyramid {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;
        int n = Integer.parseInt(in.readLine());
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                if (num > n) {
                    break;
                }
                System.out.print(num + " ");
                num++;
            }
            if (num > n) {
                break;
            }
            System.out.println();
        }
    }
}

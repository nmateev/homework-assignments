import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RectangleOfNxNStars {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        in.close();
        for (int row = 0; row <n ; row++) {
            for (int col = 0; col < n ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

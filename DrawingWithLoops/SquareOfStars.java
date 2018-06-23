import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareOfStars {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        in.close();
        for (int row = 0; row <n ; row++) {
            System.out.print("*");
            for (int col = 0; col < n-1 ; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        //ctrl + y del line
        //ctrl shift l format current
        //ctrl shift alt l format file
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int count = 0;
        for (int first = 1; first <= 9; first++) {
            for (int second = 1; second <= 9; second++) {
                for (int third = 1; third <= 9; third++) {
                    for (int fourth = 1; fourth <= 9; fourth++) {
                        if (n % first == 0 && n % second == 0 && n % third == 0 && n % fourth == 0) {
                            System.out.print(first + "" + second + "" + third + "" + fourth + " ");
                            count++;
                            if (count == 16) {
                                System.out.println();
                                count = 0;
                            }

                        }
                    }
                }
            }

        }
    }

}

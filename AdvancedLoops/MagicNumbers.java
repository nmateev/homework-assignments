import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int count = 0;
        for (int first = 1; first <= n; first++) {
            for (int second = 1; second <= n; second++) {
                for (int third = 1; third <= n; third++) {
                    for (int fourth = 1; fourth <= n; fourth++) {
                        for (int fifth = 1; fifth <= n; fifth++) {
                            for (int sixth = 1; sixth <= n; sixth++) {
                                if (first * second * third * fourth * fifth * sixth == n) {
                                    System.out.print(first + "" + second + "" + third + "" + fourth + "" + fifth + "" + sixth + " ");
                                    count++;
                                    if (count == 13) {
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
    }
}

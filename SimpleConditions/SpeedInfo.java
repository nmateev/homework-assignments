import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpeedInfo {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double input = Double.parseDouble(in.readLine());
        if (input <= 10) {
            System.out.println("slow");
        } else if (input <= 50) {
            System.out.println("average");
        } else if (input <= 150) {
            System.out.println("fast");
        } else if (input <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}

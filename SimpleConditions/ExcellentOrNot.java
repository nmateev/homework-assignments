import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExcellentOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double grade = Double.parseDouble(in.readLine());
        if (grade >= 5.50) {
            System.out.println("Excellent!");
        }else{
            System.out.println("Not excellent.");
        }
    }
}

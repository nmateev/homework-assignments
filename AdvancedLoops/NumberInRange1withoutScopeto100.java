import java.io.*;

public class NumberInRange1withoutScopeto100 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String invitation = "Еnter a number in the range [1...100]:";
        System.out.println(invitation);
        int n = Integer.parseInt(in.readLine());
        while (n < 1 || n > 100) {
            System.out.println(invitation);
            n = Integer.parseInt(in.readLine());
        }
        System.out.printf("The number is: %d", n);
    }
}

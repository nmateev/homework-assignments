import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HalfSumElement {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int sum = 0 ;
        int max = Integer.MIN_VALUE ;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(in.readLine());
            if(number>max){
                max = number;
            }
            sum+=number;
        }
        int difference = Math.abs(max-(sum-max));
        if((sum-max)==max){
            System.out.println("Yes");
            System.out.println("Sum = "+ (sum-max));
        }
        else {
            System.out.println("No");
            System.out.println("Diff = " + difference);
        }
    }
}

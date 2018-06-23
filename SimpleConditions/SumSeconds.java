import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSeconds {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(in.readLine());
        int second = Integer.parseInt(in.readLine());
        int third = Integer.parseInt(in.readLine());

        int sumOfThree = first + second + third;
        int minutes = sumOfThree / 60;
        int seconds = sumOfThree % 60;
        if (minutes < 1 && seconds < 60) {
            if (seconds < 10) {
                System.out.format("0:0%d", seconds);
            }else{
            System.out.println("0:" + seconds);}
        } else if (minutes>0 && seconds < 60) {
            if (seconds < 10) {
                System.out.format("%d:0%d", minutes, seconds);
            } else {
                System.out.format("%d:%d", minutes, seconds);
            }
        }
    }

}


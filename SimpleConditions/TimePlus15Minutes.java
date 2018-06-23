import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimePlus15Minutes {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int hour = Integer.parseInt(in.readLine());
        int min = Integer.parseInt(in.readLine());

        int allInMinutes = (hour * 60) + min + 15;
        int newHour = allInMinutes / 60;
        int newMin = allInMinutes % 60;
        if (newMin < 10) {
            if (newHour == 24) {
                System.out.format("0:0%d", newMin);
            } else {
                System.out.format("%d:0%d", newHour, newMin);
            }

        } else {
            if (newHour == 24) {
                System.out.format("0:%d", newMin);
            } else {
                System.out.println(newHour + ":" + newMin);
            }
        }


    }
}

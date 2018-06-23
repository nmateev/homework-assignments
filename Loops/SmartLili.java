import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmartLili {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(in.readLine());
        double priceWashingMachine = Double.parseDouble(in.readLine());
        double priceOfSingleToy = Double.parseDouble(in.readLine());
        int moneyCollected = 0;
        int countOfToys = 0;
        int money = 10;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneyCollected += money - 1;
                money = money + 10;
            } else {
                countOfToys++;

            }
        }
        double finalMoney = moneyCollected + (priceOfSingleToy * countOfToys);
        if (finalMoney >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", (finalMoney - priceWashingMachine));
        } else {
            System.out.printf("No! %.2f", Math.abs((finalMoney - priceWashingMachine)));
        }
    }
}

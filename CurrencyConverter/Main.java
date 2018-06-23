import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double currency = Double.parseDouble(in.nextLine());
        String incCurrency = in.nextLine();
        String outCurrency = in.nextLine();
        double usdTrading = 1.79549;
        double eurTrading = 1.95583;
        double gbpTrading = 2.53405;
        double result;
        switch (incCurrency){

            case "USD":
                switch (outCurrency) {
                    case "BGN":
                        result = currency * usdTrading;
                        System.out.printf("%.2f BGN", result);
                        break;
                    case "EUR":
                        result = (currency * usdTrading) /eurTrading ;
                        System.out.printf("%.2f EUR", result);
                        break;
                    case "GBP":
                        result = (currency * usdTrading) /gbpTrading ;
                        System.out.printf("%.2f GBP", result);
                        break;
                }
                break;
            case "BGN":
                switch (outCurrency) {
                    case "USD":
                        result = currency / usdTrading;
                        System.out.printf("%.2f USD", result);
                        break;
                    case "EUR":
                        result = currency / eurTrading;
                        System.out.printf("%.2f EUR", result);
                        break;
                    case "GBP":
                        result = currency / gbpTrading;
                        System.out.printf("%.2f GBP", result);
                        break;
                }break;
            case "EUR":
                switch (outCurrency) {
                    case "USD":
                        result = (currency * eurTrading) /gbpTrading ;
                        System.out.printf("%.2f USD", result);
                        break;
                    case "BGN":
                        result = currency * eurTrading;
                        System.out.printf("%.2f BGN", result);
                        break;
                    case "GBP":
                        result = (currency * eurTrading) / gbpTrading ;
                        System.out.printf("%.2f GBP", result);
                        break;
                }break;
            case "GBP":
                switch (outCurrency) {
                    case "USD":
                        result = (currency * gbpTrading) /usdTrading ;
                        System.out.printf("%.2f USD", result);
                        break;
                    case "BGN":
                        result = currency / gbpTrading;
                        System.out.printf("%.2f BGN", result);
                        break;
                    case "EUR":
                        result = (currency * gbpTrading) / eurTrading ;
                        System.out.printf("%.2f EUR", result);
                        break;
                }break;
        }

    }
}
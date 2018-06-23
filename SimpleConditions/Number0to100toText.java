import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number0to100toText {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(in.readLine());
        String[] numAsText = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                "eighty", "ninety", "one hundred"};
        if (input < 0 || input > 100) {
            System.out.println("invalid number");
        } else if (input < 20) {
            switch (input) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else {
            if (input == 100) {
                System.out.println(numAsText[numAsText.length - 1]);
            } else {
                int secondDigit = input % 10;
                int firstDigit = (input / 10) % 10;


                if (secondDigit == 0) {
                    switch (firstDigit) {
                        case 2:
                            System.out.println(numAsText[20]);
                            break;
                        case 3:
                            System.out.println(numAsText[21]);
                            break;
                        case 4:
                            System.out.println(numAsText[22]);
                            break;
                        case 5:
                            System.out.println(numAsText[23]);
                            break;
                        case 6:
                            System.out.println(numAsText[24]);
                            break;
                        case 7:
                            System.out.println(numAsText[25]);
                            break;
                        case 8:
                            System.out.println(numAsText[26]);
                            break;
                        case 9:
                            System.out.println(numAsText[27]);
                            break;
                    }
                } else {
                    switch (firstDigit) {
                        case 2:
                            System.out.print(numAsText[20] + " ");
                            break;
                        case 3:
                            System.out.print(numAsText[21] + " ");
                            break;
                        case 4:
                            System.out.print(numAsText[22] + " ");
                            break;
                        case 5:
                            System.out.print(numAsText[23] + " ");
                            break;
                        case 6:
                            System.out.print(numAsText[24] + " ");
                            break;
                        case 7:
                            System.out.print(numAsText[25] + " ");
                            break;
                        case 8:
                            System.out.print(numAsText[26] + " ");
                            break;
                        case 9:
                            System.out.print(numAsText[27] + " ");
                            break;

                    }
                    switch (secondDigit) {
                        case 1:
                            System.out.print("one");
                            break;
                        case 2:
                            System.out.print("two");
                            break;
                        case 3:
                            System.out.print("three");
                            break;
                        case 4:
                            System.out.print("four");
                            break;
                        case 5:
                            System.out.print("five");
                            break;
                        case 6:
                            System.out.print("six");
                            break;
                        case 7:
                            System.out.print("seven");
                            break;
                        case 8:
                            System.out.print("eight");
                            break;
                        case 9:
                            System.out.print("nine");
                            break;
                    }

                }

            }
        }
    }
}
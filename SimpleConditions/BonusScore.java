import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BonusScore {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter score: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(in.readLine());
        double bonusScore = 0;
        if (num > 1000) {
            bonusScore = num * 0.10;
        } else if (num > 100) {
            bonusScore = num * 0.20;
        } else {
            bonusScore = 5;
        }
        if (num % 10 == 5)
            bonusScore += 2;
        else if (num % 2 == 0) {
            bonusScore += 1;
        }
        if(Math.floor(bonusScore) == bonusScore) {
            System.out.format("Bonus score: %.0f\n",bonusScore);
        } else {
            System.out.println("Bonus score: " + bonusScore);
        }
        if(Math.floor((num + bonusScore)) == (num + bonusScore)) {
            System.out.format("Total score: %.0f\n",(num + bonusScore));
        } else {
            System.out.println("Total score: " + (num + bonusScore));
        }
        /*if((int)(bonusScore) == bonusScore) {
            System.out.format("Bonus score: %.0f\n",bonusScore);
        } else {
            System.out.println("Bonus score: " + bonusScore);
        }
        if((int)((num + bonusScore)) == (num + bonusScore)) {
            System.out.format("Total score: %.0f\n",(num + bonusScore));
        } else {
            System.out.println("Total score: " + (num + bonusScore));
        }*/

    }
}

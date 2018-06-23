import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordGuess {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        if(input.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelsSum {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int value = 0 ;
        int sum = 0 ;
       String text = in.readLine();
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)){
                case 'a':value = 1;break;
                case 'e':value = 2;break;
                case 'i':value = 3;break;
                case 'o':value = 4;break;
                case 'u':value = 5;break;
            }
            sum+=value;
            value=0;
        }
        System.out.println(sum);


    }
}

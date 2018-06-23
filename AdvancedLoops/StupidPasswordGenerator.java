import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StupidPasswordGenerator {
    public static void main(String[] args) throws IOException {
        char[] chars = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int l = Integer.parseInt(in.readLine());
       l=l-1;
       int count = 0;
        for (int firstNum = 1; firstNum <n ; firstNum++) {
            for (int secondNum = 1; secondNum <n ; secondNum++) {
                for (int firstChar = 0; firstChar <=l ; firstChar++) {
                    for (int secondChar = 0; secondChar <=l ; secondChar++) {
                        for (int finNum = Math.max(firstNum,secondNum)+1; finNum <=n ; finNum++) {
                            System.out.print(firstNum+""+secondNum+""+chars[firstChar]+""+chars[secondChar]+""+finNum+", ");
                            count++;
                            if(count==13){
                                System.out.println();
                                count=0;
                            }
                        }
                    }
                }
            }
        }
    }
}

import java.io.*;

public class Sequence2kPlus1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int num = 1;
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        while (num <= n) {
            out.println(num);
            num = (num * 2) + 1;
        }
        out.close();
    }
}

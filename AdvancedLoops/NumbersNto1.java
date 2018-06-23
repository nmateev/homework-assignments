import java.io.*;

public class NumbersNto1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(in.readLine());
        for (int i = n; i > 0; i--) {
            out.println(i);
        }
        out.close();
    }
}

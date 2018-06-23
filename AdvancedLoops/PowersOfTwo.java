import java.io.*;

public class PowersOfTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        for (int i = 0; i <= n; i++) {
            out.println(1 << i);
        }
        out.close();
    }
}

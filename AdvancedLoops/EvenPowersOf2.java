import java.io.*;

public class EvenPowersOf2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        for (int i = 0; i <= n; i += 2) {
            out.println(1 << i);
        }
        out.close();
    }
}

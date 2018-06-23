import java.io.*;

public class Numbers1ToNWithStep3 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        PrintWriter outWriter = new PrintWriter(new BufferedOutputStream(System.out));
        for (int i = 1; i <= n; i += 3) {
            outWriter.println(i);
        }
        outWriter.close();
    }
}

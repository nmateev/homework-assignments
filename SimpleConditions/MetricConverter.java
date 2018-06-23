import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MetricConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double size = Double.parseDouble(in.readLine());
        String src = in.readLine();
        String out = in.readLine();
        switch(src){
            case "m":break;
            case "mm": size = size / 1000; break;
            case "cm": size = size / 100; break;
            case "mi": size = size / 0.000621371192; break;
            case "in": size = size / 39.3700787; break;
            case "km": size = size * 1000; break;
            case "ft": size = size / 3.2808399; break;
            case "yd":size = size / 1.0936133; break;

        }

        switch(out){
            case "mm": size = size * 1000; break;
            case "cm": size = size * 100; break;
            case "mi": size = size * 0.000621371192; break;
            case "in": size = size * 39.3700787; break;
            case "km":size = size / 1000; break;
            case "ft": size = size * 3.2808399; break;
            case "yd": size = size * 1.0936133; break;

        }
        System.out.format("%.8f %s", size, out);
    }
}

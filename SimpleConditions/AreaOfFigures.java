import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfFigures {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine().toLowerCase();
        switch (input) {
            case "square":
                double lenghtSide = Double.parseDouble(in.readLine());
                double result2 =  lenghtSide *  lenghtSide;
                System.out.format("%.3f", result2);
                break;
            case "rectangle":
                double lengthSide = Double.parseDouble(in.readLine());
                double lengthSide2 = Double.parseDouble(in.readLine());
                double result = lengthSide * lengthSide2;
                System.out.format("%.3f", result);
                break;
            case "circle":
                double r = Double.parseDouble(in.readLine());
                double area = Math.PI * (Math.pow(r,2));
                System.out.format("%.3f", area);
                break;
            case "triangle":
                double side = Double.parseDouble(in.readLine());
                double height2 = Double.parseDouble(in.readLine());
                double fin = (side * height2) / 2;
                System.out.format("%.3f",fin);

                break;
        }
    }
}

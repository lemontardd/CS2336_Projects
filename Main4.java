import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        System.out.print("Enter a point's x- and y-coordinates: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        input.close();

        double lineEqu = -0.5 * x + 100;
        if (lineEqu >= y && x >= 0 && x <= 200 && y >= 0 && y <= 100) {
            System.out.print("The point is in the triangle");
        } else {
            System.out.print("The point is not in the triangle");
        }

        }
    }
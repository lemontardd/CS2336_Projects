import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        System.out.print("Enter a point with two coordinates: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        input.close();

        if (x > -5 && x < 5 && y > -10 && y < 10) {
            System.out.print("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.print("Point (" + x + ", " + y + ") is not in the rectangle");
        }

        }
    }

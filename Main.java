import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();

        double disc = Math.pow(b, 2) - 4 * a * c;
        double r1 = (-b + Math.pow(disc, 0.5))/(2 * a);
        double r2 = (-b - Math.pow(disc, 0.5))/(2 * a);

        if (disc > 0) {
            System.out.print("The equation has two roots " + r1 + " and " + r2);
        } else if (disc == 0) {
            System.out.print("The equation has one root  " + r1);
        } else {
            System.out.print("The equation has no real roots.");
        }

        }
    }


import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        // System.out.print("Enter month and year: ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int year = input.nextInt();
        input.close();

        String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.print(".*February" + ".*" + year + ".*29");
        } else {
            System.out.print(".*" + monthName[month-1] + ".*" + year + ".*" + monthDays[month-1]);
        }


        }
    }

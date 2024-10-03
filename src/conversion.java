import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        double meters = 0;
        final double METERS_TO_MILES = 0.00062137;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.37008;
        double miles;
        double feet;
        double inches;
        boolean valid = false;

        //data collection
        do {
            System.out.println("enter meter measurement:");
            if (scan.hasNextDouble()){
                meters = scan.nextDouble();
                if (meters > 0) {
                    valid = true;
                }
                else {
                    System.out.println("You have entered an invalid measurement. Please retry.");
                    scan.nextLine();
                }
            }
            else {
                System.out.println("You have entered an invalid measurement. Please retry.");
                scan.nextLine();
            }
        } while (!valid);

        //math
        miles = meters * METERS_TO_MILES;
        feet = meters * METERS_TO_FEET;
        inches = meters * METERS_TO_INCHES;

        //output
        System.out.printf("%5s %10.2f", "Meters:", meters);
        System.out.printf("%5s %11.2f", "\nMiles:", miles);
        System.out.printf("%5s %12.2f", "\nFeet:", feet);
        System.out.printf("%5s %10.2f", "\nInches:", inches);

    }
}
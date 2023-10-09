import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double degreesC;
        double degreesF;
        String yn;
        boolean done = false;

        do {
            System.out.println("Please enter a temperature in degrees C to be converted to degrees F:");
            if (scan.hasNextDouble()) {
                degreesC = scan.nextDouble();
                degreesF = (degreesC * 9)/5 + 32;
                scan.nextLine();
                System.out.printf("\nDegrees C : %8.2f", degreesC);
                System.out.printf("\nDegrees F : %8.2f", degreesF);
                System.out.println("\nWould you like to input another temperature? [Y/N]");
                yn = scan.nextLine();
                if (yn.equalsIgnoreCase("N")) {
                    done = true;
                }
            } else {
                System.out.println("You have entered an invalid temperature value. Please try again.");
                scan.next();
            }
        } while (!done);
    }
}
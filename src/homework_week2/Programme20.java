package homework_week2;

import java.util.Scanner;

public class Programme20 {
    /**
     * a Java Program to print as below.
     * "+------------------------+"
     * "| |"
     * "| CORNER STORE |"
     * "| |"
     * "| 2015-03-29 04:38PM |"
     * "| |"
     * "| Gallons: 10.870 |"
     * "| Price/gallon: $ 2.089 |"
     * "| |"
     * "| Fuel total: $ 22.71 |"
     * "| |"
     * "+------------------------+"
     */

    //static method
    public static void m20() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date (YYYY-MM-DD HH:MM): ");
        String date = scanner.nextLine();
        System.out.println("Enter the gallons: ");
        double gallons = scanner.nextDouble();
        System.out.println("Enter the price per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        // Calculate fuel total
        double fuelTotal = gallons * pricePerGallon;

        // Print the receipt
        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.println("|      CORNER STORE      |");
        System.out.println("|                        |");
        System.out.println("|   " + date + "   |");
        System.out.println("|                        |");
        System.out.printf("|   Gallons: %.3f      |\n", gallons);
        System.out.printf("|   Price/gallon: $ %.3f|\n", pricePerGallon);
        System.out.println("|                        |");
        System.out.printf("|   Fuel total: $ %.2f  |\n", fuelTotal);
        System.out.println("|                        |");
        System.out.println("+------------------------+");


    }


    // main method (static method calling by main method)
    public static void main(String[] args) {
        m20();
    }

}















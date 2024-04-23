package homework_week2;

import java.util.Scanner;

public class Programme7 {
    /**
     * a program to insert any temperature value in degree Fahrenheit and
     * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */

    // static method with scanner
    public static void m7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius + " °C");

    }

    // main method
    public static void main(String[] args) {
        m7();

    }

}

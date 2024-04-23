package homework_week2;

import java.util.Scanner;

public class Programme6 {
    /**
     * a program to enter any radius value of the circle and find out the
     * area.(Formula of Area A=PI*r*r).
     */

    // static void with scanner
    public static void m6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:  ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

    }

    // main method
    public static void main(String[] args) {
        m6();
    }
}

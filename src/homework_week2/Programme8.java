package homework_week2;

import java.util.Scanner;

public class Programme8 {
    /**
     * a program to calculate the area of a triangle.
     */

    // instance method with scanner
    public void m8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Base of the triangle");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);

    }

    // main method (Instance method calling by main method)
    public static void main(String[] args) {
        Programme8 programme8 = new Programme8();
        programme8.m8();
    }

}

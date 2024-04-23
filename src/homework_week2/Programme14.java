package homework_week2;

import java.util.Scanner;

public class Programme14 {
    /**
     * Write a Java program to print the area and perimeter of a rectangle.
     * Test Data:
     * Width = 5.5 Height = 8.5
     * Expected Output:
     * Area is 5.6 * 8.5 = 47.60
     * Perimeter is 2 * (5.6 + 8.5) = 28.20
     */

    // instance method with scanner
    public void m14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width and height: ");
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = width * height;
        System.out.println("Area is " + width + " * " + height + " = " + area);
        double perimeter = 2 * (width + height);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);

    }


    // main method (Instance method calling by main method)
    public static void main(String[] args) {
        Programme14 programme14 = new Programme14();
        programme14.m14();

    }
}

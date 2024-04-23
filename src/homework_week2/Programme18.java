package homework_week2;

import java.util.Scanner;

public class Programme18 {
    /**
     * a Java program to print the sum (addition), multiply, subtract, divide and
     * remainder of two numbers.
     * Test Data:
     * Input first number: 125
     * Input second number: 24
     * Expected Output :
     * 125 + 24 = 149
     * 125 - 24 = 101
     * 125 x 24 = 3000
     * 125 / 24 = 5
     * 125 mod 24 = 5
     */

    //static method with scanner
    public static void m18() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int multiplication = num1 * num2;
        int subtract = num1 - num2;
        int divide = num1 / num2;
        int remainder = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + multiplication);
        System.out.println(num1 + " - " + num2 + " = " + subtract);
        System.out.println(num1 + " / " + num2 + " = " + divide);
        System.out.println(num1 + " % " + num2 + " = " + remainder);

    }

    // main method
    public static void main(String[] args) {
        m18();
    }
}

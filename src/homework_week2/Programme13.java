package homework_week2;

import java.util.Scanner;

public class Programme13 {
    /**
     * a Java program that takes three numbers as input to calculate and
     * print the average of the numbers.
     */

    //instance method with scanner
    public void m13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first numbers:  ");
        double n1 = scanner.nextDouble();
        System.out.println("Enter the second numbers:  ");
        double n2 = scanner.nextDouble();
        System.out.println("Enter the third numbers:  ");
        double n3 = scanner.nextDouble();

        double average = (n1 + n2 + n3) / 3;
        System.out.println("The average of three number is: " + average);

    }


    // main method (Instance method calling by main method)
    public static void main(String[] args) {
        Programme13 programme13 = new Programme13();
        programme13.m13();

    }
}

package homework_week2;

import java.util.Scanner;

public class Programme15 {
    /**
     * a Java program to swap two variables.
     */

    // instance method with scanner
    public void m15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        double first = scanner.nextDouble();
        System.out.println("Enter a second number: ");
        double second = scanner.nextDouble();
        System.out.println("Before swapping: ");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);

        //swap the variables
        double temp = first;
        first = second;
        second = temp;
        System.out.println("After swapping: ");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);

    }

    // main method (Instance method calling by main method)
    public static void main(String[] args) {
        Programme15 programme15 = new Programme15();
        programme15.m15();
    }


}

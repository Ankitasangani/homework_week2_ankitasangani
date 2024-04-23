package homework_week2;

import java.util.Scanner;

public class Programme16 {
    /**
     * a Java program to add two binary numbers.
     * Input Data:
     * Input first binary number: 10
     * Input second binary number: 11
     * Expected Output:
     * Sum of two binary numbers: 101
     */

    //instance method with scanner
    public void m16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first binary number: ");
        String binary1 = scanner.next();
        System.out.println("Enter second binary number: ");
        String binary2 = scanner.next();
        // convert binary numbers to integers and add them
        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2, 2);
        int sum = decimal1 + decimal2;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: " + binarySum);

    }

    // main method (Instance method calling by main method)
    public static void main(String[] args) {
        Programme16 programme16 = new Programme16();
        programme16.m16();


    }
}

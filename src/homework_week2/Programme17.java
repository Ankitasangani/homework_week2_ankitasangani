package homework_week2;

import java.util.Scanner;

public class Programme17 {
    /**
     * a Java program to convert a decimal number to binary number.
     * Input Data:
     * Input a Decimal Number : 5
     * Expected Output
     * Binary number is: 101
     */

    // instance method with scanner
    public void m17() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        // convert decimal number to binary
        String binaryNumber = " ";
        while (decimalNumber > 0) {
            int reminder = decimalNumber % 2;
            binaryNumber = reminder + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }
        System.out.println("Binary number is: " + binaryNumber);

    }


    // main method (Instance method calling by main method)
    public static void main(String[] args) {
        Programme17 programme17 = new Programme17();
        programme17.m17();
    }

}

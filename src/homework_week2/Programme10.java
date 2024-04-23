package homework_week2;

import java.util.Scanner;

public class Programme10 {
    /**
     * a Java program that takes a number as input and prints its
     * multiplication table up to 10.
     * Test Data: Input a number: 8
     * Expected Output :
     * 8 x 1 = 8
     * 8 x 2 = 16
     * 8 x 3 = 24
     * ...
     * 8 x 10 = 80
     */

    // static method (With scanner)
    public static void m10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:  ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));

        }

    }

    // static method
    public static void main(String[] args) {
        m10();
    }

}

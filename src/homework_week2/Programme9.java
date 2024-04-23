package homework_week2;

import java.util.Scanner;

public class Programme9 {
    /**
     * a program to convert the upper case to lower case.
     */

    // instance method (With scanner)
    public void m9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string in upper case: ");
        String input = scanner.nextLine();
        String lowercase = input.toLowerCase();
        System.out.println("Converted to lower case:   " + lowercase);

    }

    // main method (Instance method calling by main method)
    public static void main(String[] args) {
        Programme9 programme9 = new Programme9();
        programme9.m9();

    }

}

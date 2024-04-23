package homework_week2;

import java.util.Scanner;

public class Programme19 {
    /**
     * a Java program to convert a given string into lowercase.
     * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
     * Output: the quick brown fox jumps over the lazy dog.
     */

    // instance method with scanner
    public void m19() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string in upper case: ");
        String input = scanner.nextLine();
        String lowercase = input.toLowerCase();
        System.out.println("Converted to lower case:   " + lowercase);

    }

    //main method (Instance method calling by main method)
    public static void main(String[] args) {
        Programme19 programme19 = new Programme19();
        programme19.m19();
    }

}

package homework_week2;


import java.util.Scanner;

public class Programme5 {
    /**
     * a program for a calculator with addition, subtraction, multiplication
     * and division methods all with parameters and use string concatenation
     * methods.(Note: Two static and Two instance methods.)
     */


    // addition method with params(static method)
    public static void addition(int a, int b) {
        int answer = a + b;
        // concatenation
        System.out.println("addition of two numbers " + a + " and " + b + " is " + answer);

    }

    // subtraction method with params(static method)
    public static void subtraction(int a, int b) {
        int answer = a - b;
        // concatenation
        System.out.println("subtraction of two numbers " + a + " and " + b + " is " + answer);

    }

    // multiplication method with params(instance method)
    public void multiplication(int a, int b) {
        int answer = a * b;
        // concatenation
        System.out.println("multiplication of two numbers " + a + " and " + b + " is " + answer);

    }

    // division method with params(instance method)
    public void division(int a, int b) {
        int answer = a / b;
        // concatenation
        System.out.println("division of two numbers " + a + " and " + b + " is " + answer);


    }

    // main method with scanner
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:  ");
        int a = scanner.nextInt();
        System.out.println("Enter second number:  ");
        int b = scanner.nextInt();
        addition(a, b);
        subtraction(a, b);
        Programme5 programme5 = new Programme5();
        programme5.multiplication(a, b);
        programme5.division(a, b);

    }
}

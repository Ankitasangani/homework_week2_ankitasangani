package homework_week2;

public class Programme12 {
    /**
     * a Java program to compute the specified expressions and print the
     * output.
     * Test Data:
     * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * Expected Output : 2.138888888888889
     */

    // instance method
    public void m12() {
        double d = 25.5;
        double d1 = 3.5;
        double d2 = 40.5;
        double d3 = 4.5;
        double output = ((d * d1 - d1 * d1) / (d2 - d3));
        System.out.println(output);

    }

    // main method (Instance method calling by main method)
    public static void main(String[] args) {
        Programme12 programme12 = new Programme12();
        programme12.m12();

    }

}

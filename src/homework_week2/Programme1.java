package homework_week2;

public class Programme1 {
    /**
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */

    // instance variables
    String myName = "Ankita";
    String name = "Sangani";

    // instance method (calling instance variables into the instance method inside the print statement)
    public void m1() {
        System.out.println(myName);
        System.out.println(name);
    }

    //main method (calling instance method into the main method with object)
    public static void main(String[] args) {
        Programme1 obj = new Programme1();
        obj.m1();

    }

}

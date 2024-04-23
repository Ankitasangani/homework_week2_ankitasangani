package homework_week2;

public class Programme2 {
    /**
     * 2.1 Declare two static variables
     * 2.2 Declare one static method
     * 2.3 Call both static variables into the static method inside the print statement.
     * 2.4 Declare the Main method.
     * 2.5 Call the static method into the Main method and Run the programme.
     */
    // static variables
    static String myName = "Ankita";
    static String name = "Sangani";

    // static method (calling static variables direct and with class name)
    public static void m2() {
        System.out.println(myName);
        System.out.println(Programme2.myName);
        System.out.println(name);
        System.out.println(Programme2.name);

    }


    // main method (calling static method into the main method directly)
    public static void main(String[] args) {
        m2();
    }

}
















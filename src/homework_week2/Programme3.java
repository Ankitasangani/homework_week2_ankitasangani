package homework_week2;

public class Programme3 {
    /**
     * 3.1 Declare one instance and one static variable.
     * 3.2 Declare one instance method.
     * 3.3 Declare one static method.
     * 3.4 Call both instance and static variables into both instance and static methods inside the
     * print statement.
     * 3.5 Declare the Main method.
     * 3.6 Call both instance and static methods into the Main method and run the programme.
     */

    // one instance and one static variable
    String myName = "Ankita";
    static String name = "Sangani";

    // instance method
    public void m3() {
        System.out.println(myName);
        System.out.println(Programme3.name);
    }

    // static method
    public static void m4() {
        Programme3 obj = new Programme3();
        System.out.println(obj.myName);
        System.out.println(name);
    }

    // main method (Call both instance method with object and static methods into the Main method)
    public static void main(String[] args) {
        Programme3 programme3 = new Programme3();
        programme3.m3();
        m4();
    }

}

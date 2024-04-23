package homework_week2;

public class Programme4 {
    /**
     * 4.1 Declare two instance and two static variables.
     * 4.2 Declare one instance method.
     * 4.3 Declare one static method.
     * 4.4 Call all four instance and static variables into both instance and static methods inside the
     * print statement.
     * 4.5 Declare the Main method.
     * 4.6 Call both instance and static methods into the Main method and run the programme.
     */

    // two instance and two static variables
    int a = 10;
    String myName = "Ankita";
    static int b = 20;
    static String name = "Sangani";

    //instance method
    public void m4() {
        System.out.println(a);
        System.out.println(myName);
        System.out.println(Programme4.b);
        System.out.println(Programme4.name);

    }

    // static method
    public static void m5() {
        Programme4 pro = new Programme4();
        System.out.println(pro.a);
        System.out.println(pro.myName);
        System.out.println(b);
        System.out.println(name);

    }

    // main method
    public static void main(String[] args) {
        Programme4 pro = new Programme4();
        pro.m4();
        m5();
    }

}

package homework_week2;

public class Methods {
    /**
     * 10 instance methods (5 with parameters, 5 without parameters)
     * 10 static methods (5 with parameters, 5 without parameters)
     * Each method demonstrates the use of different access modifiers (public, protected, private, default)
     */

    //////////////////////////////////////////////////////////////////
    // with params


    // Instance methods with parameters
    public void m1(int a, int b){
        int answer = a + b;
        System.out.println(answer);
    }

    // Instance methods with parameters
    protected void m2(byte c, byte d){
          byte value = (byte)(c + d);
        System.out.println(value);
    }

    // Instance methods with parameters
    private void m3(short e, short f){
        short value = (short) (e * f);
        System.out.println(value);
    }

    // Instance methods with parameters
    void m4(long a, long b){
         long value = (long) (a - b);
        System.out.println(value);
    }

    // Instance methods with parameters
    public void m5(char name, char myName){
        System.out.println(name);
        System.out.println(myName);
    }

    // static method with parameters
    public static void m6(boolean x, boolean y){
        boolean result = x && y;
        System.out.println(result);
    }

    // static method with parameters
    protected static void m7(double a, double b){
        double d1 = (double) (a+b);
        System.out.println(d1);
    }

    // static method with parameters
    private static void m8(float m, float n){
        float f1 = (float) (m + n);
        System.out.println(f1);
    }

    // static method with parameters
     static void m9(String name, String myName){
        System.out.println(name);
         System.out.println(myName);
    }

    // static method with parameters
    public static void m10(int p, int q){
        int answer = p * q;
        System.out.println(answer);
    }


    //////////////////////////////////////////////////////////////
    // without params


    // Instance methods without parameters
    public void m11(){
        int a = 10;
        int b = 20;
        int answer = a + b;
        System.out.println(answer);
    }

    // Instance methods without parameters
    protected void m12(){
        byte c = 10;
        byte d = 20;
        byte value = (byte)(c + d);
        System.out.println(value);
    }

    // Instance methods without parameters
    private void m13(){
        short e = 10;
        short f = 20;
        short value = (short) (e * f);
        System.out.println(value);
    }

    // Instance methods without parameters
    void m14(){
        long a = 10;
        long b = 20;
        long value = (long) (a - b);
        System.out.println(value);
    }

    // Instance methods without parameters
    public void m15(){
        char name = 'a';
        char myName = 's';
        System.out.println(name);
        System.out.println(myName);
    }

    // static method without parameters
    public static void m16(){
        boolean x = true;
        boolean y = false;
        boolean result = x && y;
        System.out.println(result);
    }

    // static method without parameters
    protected static void m17(){
        double a = 10;
        double b = 20;
        double d1 = (double) (a+b);
        System.out.println(d1);
    }

    // static method without parameters
    private static void m18(){
        float m = 10;
        float n = 20;
        float f1 = (float) (m + n);
        System.out.println(f1);
    }

    // static method without parameters
    static void m19(){
        String name = "ankita";
        String myName = "sangani";
        System.out.println(name);
        System.out.println(myName);
    }

    // static method without parameters
    public static void m20(){
        int p = 20;
        int q = 20;
        int answer = p * q;
        System.out.println(answer);
    }




    // main method
    public static void main(String[] args) {
        Methods methods = new Methods();


        // main method calling instance method
        methods.m1(10,20);
        methods.m2((byte)10, (byte)20);
        methods.m3((short)10, (short)20);
        methods.m4((long) 10, (long) 20);
        char name = 'a';
        char myName = 's';
        methods.m5(name, myName);
        methods.m11();
        methods.m12();
        methods.m13();
        methods.m14();
        methods.m15();


        // main method calling static method
         m6(true, false);
         m7(10,20);
         m8(10,20);
         m9("ankita", "sangani");
         m10(20, 40);
         m16();
         m17();
         m18();
         m19();
         m20();

    }

}

package myFirstPackage;

public class myTestClass {
    public static String testMethod( int num ) {
        return "I got "+num;
    }

    public static void main(String[] args) {
        System.out.println("Hello ! This is my first Java class in years..... !!");
        System.out.println(testMethod(8));
    }
}

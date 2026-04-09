package assignments;
public class Overloading {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static void main(String[] args) {
        System.out.println("Two numbers: " + multiply(5, 4));
        System.out.println("Three numbers: " + multiply(5, 4, 2));
        System.out.println("Two decimals: " + multiply(5.5, 2.0));
    }
}
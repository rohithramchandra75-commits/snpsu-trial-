package assignments2;

public class zero {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;
        try {
            result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
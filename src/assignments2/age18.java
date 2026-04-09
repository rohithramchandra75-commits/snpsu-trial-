package assignments2;

public class age18 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age is less than 18. Not eligible.");
        } else {
            System.out.println("You are eligible.");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
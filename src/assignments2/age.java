package assignments2;

class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}
public class age {
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above.");
        } else {
            System.out.println("You are eligible.");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
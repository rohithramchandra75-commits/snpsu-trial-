package day6;

public class InvalidAgeException extends Exception {
        InvalidAgeException(String s) {
            super(s);
        }}
class Driver {
        static void vote(int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("age must be over 18");
            }
            System.out.println("you can vote");
        }

        static void main(String[] args)  {
            try {
                vote(10);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }


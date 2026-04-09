package assignments;
import java.util.Scanner;
public class FactorialRecursion {
    public static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("negative number.");
        } else {
            long result = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is: " + result);
        }
    }
}
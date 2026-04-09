package assignments;
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("enter a word");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String reversed = new StringBuilder(word).reverse().toString();
        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }
}
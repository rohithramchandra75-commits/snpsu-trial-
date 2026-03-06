import java.util.Scanner;
public class pattern4 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size;
        size= sc.nextInt();
        for (int i = 1; i <=size; i++) {
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            for (int space = 2 * i; space < 2 * size; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i = size-2; i>=0; i--) {
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            for (int space = 2 * i; space < 2 * size; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

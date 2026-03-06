import java.util.Scanner;
public class trialpattern {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size-i-1; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=size-2;i>=0;i--) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

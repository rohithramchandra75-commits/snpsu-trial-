package assignments;
public class SumOfEvens {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
    }
}
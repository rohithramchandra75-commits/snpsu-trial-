package assignments2;

import java.io.*;

public class unchecked {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }
        try {
            FileReader file = new FileReader("test.txt"); // may cause FileNotFoundException
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}
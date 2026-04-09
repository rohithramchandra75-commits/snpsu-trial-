package assignments2;
public class reverse {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + sb);
    }
}

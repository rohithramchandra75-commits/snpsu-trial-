package assignments2;

public class sbsb {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World");
        System.out.println("String: " + s);
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");
        System.out.println("StringBuffer: " + sbuf);
        StringBuilder sbuilder = new StringBuilder("Hello");
        sbuilder.append(" World");
        System.out.println("StringBuilder: " + sbuilder);
    }
}
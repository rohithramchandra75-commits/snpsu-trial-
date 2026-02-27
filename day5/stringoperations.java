package day5;

public class stringoperations {
    public static void main(String[] args) {
        String s1="hello";
        String s2=new String("hello");
        System.out.println("original  string:"+s1);
        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.substring(0,4));
        System.out.println(s1.startsWith("replace"));
        System.out.println(s2.trim());
        System.out.println(s2.concat(s1));
        System.out.println(s1.isEmpty());
    }
}

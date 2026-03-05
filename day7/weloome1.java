package day7;

interface greeting1 {
    void sayhello();
}
public class weloome1{
    public static void main(String[] args) {
        greeting1 g =() -> {
            System.out.println("hello");
        };
        g.sayhello();
    }
}
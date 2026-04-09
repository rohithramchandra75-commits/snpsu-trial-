package day7;

interface greeting{
    void sayhello();
}

public class weloome{
    public static void main(String[] args) {
        greeting g =new greeting() {
            @Override
            public void sayhello() {
                System.out.println("hello");
            }
        };
        g.sayhello();
    }
}
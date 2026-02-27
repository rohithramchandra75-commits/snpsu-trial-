package day4;

public interface vehicle {
    void start();

     default void stop(){
         System.out.println("stop");
     }
}
class audi implements vehicle {
    public void start(){
        System.out.println("Audi");
    }
}
class bmw implements vehicle {
    public void start(){
        System.out.println("Bmw");
    }
}
class tests implements vehicle {
    public void start(){
        System.out.println("tests");
    }
}
class driver{
    public static void main(String[] args) {
        audi a=new audi();
        bmw b=new bmw();
        tests t=new tests();
        a.start();
        b.start();
        t.start();
    }
}
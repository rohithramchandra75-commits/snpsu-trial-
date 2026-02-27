package day4;
abstract class mamal{
    static void sound() {
        System.out.println("I am alive");
    }
    abstract void eat();
}
class shash extends mamal{
    void eat() {
        System.out.println("non-veg");
    }
}
class reddy extends mamal{
    void eat() {
        System.out.println("pig");
    }
}
public class staticex{
    public static void main(String[] args) {
        shash sh = new shash();
        sh.eat();
        sh.sound();

        reddy  red = new reddy();
        red.eat();
        red.sound();
    }
}
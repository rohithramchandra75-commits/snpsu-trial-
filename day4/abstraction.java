package day4;

abstract class animal {
    abstract void eat();

    static void sound() {
        System.out.println("I am alive");
    }
}
    class rhino extends animal {
        void eat() {
            System.out.println("grass");
        }
    }
    class blackpanther extends animal {
            void eat() {
                System.out.println("flesh");
            }
}
public class abstraction{
        public static void main(String[] args) {
            rhino r=new rhino();
            r.eat();
            r.sound();

            blackpanther b=new blackpanther();
            b.eat();
            b.sound();
        }
    }
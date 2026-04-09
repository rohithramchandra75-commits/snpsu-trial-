package assignments2;
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}
class Parent {
    final void show() {
        System.out.println("This is a final method.");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Child class method.");
    }
}
public class fivequestion {
    public static void main(String[] args) {
        final int num = 10;
        System.out.println("Final variable value: " + num);
        Child c = new Child();
        c.show();
        c.display();
        FinalClass f = new FinalClass();
        f.display();
    }
}
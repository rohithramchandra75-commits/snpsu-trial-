package assignments2;
class StaticDemo {
    static int count = 0;
    StaticDemo() {
        count++;
    }
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}
public class static6 {
    public static void main(String[] args) {
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();
        StaticDemo obj3 = new StaticDemo();
        StaticDemo.displayCount();
    }
}

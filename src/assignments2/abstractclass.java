package assignments2;
abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    double area() {
        return length * width;
    }
}
public class abstractclass {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Rectangle r = new Rectangle(20, 30);

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectangle: " + r.area());
    }
}
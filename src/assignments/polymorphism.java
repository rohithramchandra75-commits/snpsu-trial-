package assignments;
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle using radius.");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle using length and width.");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Shape myShape;
        myShape = new Circle();
        myShape.draw();
        myShape = new Rectangle();
        myShape.draw();
    }
}
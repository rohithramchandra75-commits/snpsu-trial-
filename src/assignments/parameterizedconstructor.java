package assignments;
class Student {
    String name;
    int age;
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }
    public Student(String n, int a) {
        this.name = n;
        this.age = a;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class parameterizedconstructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Alice", 20);
        System.out.print("Student 1: ");
        student1.display();
        System.out.print("Student 2: ");
        student2.display();
    }
}
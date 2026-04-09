package assignments;
class Animal {
    void eat() {
        System.out.println("This animal is eating food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking: Woof! Woof!");
    }
}
public class sinheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
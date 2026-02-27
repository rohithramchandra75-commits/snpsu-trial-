package interfacedemo;
//why interfaces are not 100% abstract!
interface InterfaceExample {

    void show();//Abstract method

    default void display(){
        System.out.println("Default Method!");
    }

    static void message(){
        System.out.println("Static method!");
    }
}
class child implements interfacedemo.InterfaceExample {
    public void show(){
        System.out.println("show!");
    }
}
class Driver{
    static void main(String[] args) {
        child obj=new child();
        obj.display();
        interfacedemo.InterfaceExample.message();
    }
}
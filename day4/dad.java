package day4;

//why interfaces are not 100% abstract!
public interface dad {

    void show();//Abstract method

    default void display(){

        System.out.println("Default Method!");
    }
    static void message(){
        System.out.println("Static method!");
    }
}
class Child implements dad {
    public void show(){
        System.out.println("show!");
    }
}
class Driver{
    static void main(String[] args) {
        Child obj=new Child();
      obj.display();
        dad.message();
    }
}
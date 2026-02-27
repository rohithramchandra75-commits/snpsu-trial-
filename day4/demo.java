package day4;

public interface demo {
    void show();
     default void sound(){
         System.out.println("sound");
     }
     static void message(){
         System.out.println("message");
     }
}
class demochild implements demo {
    @Override
    public void show() {
        System.out.println("show");
    }
}
class driver2{
    public static void main(String[] args){
        demo.message();
    }
}
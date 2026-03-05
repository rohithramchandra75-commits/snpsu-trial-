package day7;

public class demo7 {
    public static void main(String[] args) {
        Thread t1=new Thread(() -> System.out.println("Mytask"));
        Thread t2=new Thread(() -> {
            for(int i=0;i<10;i++){
                System.out.println("Mytask"+i);
            }
        });
        t1.start();
        t2.start();
    }
}

package day6;

public class thread1 extends  Thread {
    public void run(){
        System.out.println("thread1");
    }
}
class demo6{
    public static void main(String[] args) {
         thread1 t1=new thread1();
         t1.start();
    }
}

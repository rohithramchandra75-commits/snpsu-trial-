package day6;

class thread3 implements Runnable{
    public void run(){
        System.out.println("thread3");
    }
}
public class demo5{
    public static void main(String[] args){
        thread3 obj=new thread3();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);

        t1.start();
        t2.start();
    }
}
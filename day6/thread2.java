package day6;

public class thread2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("thread:"+i);
        }
    }
}
class demo4{
    public static void main(String[] args){
        thread2 t1=new thread2();
        t1.start();

        for(int i=1;i<=5;i++){
            System.out.println("main:"+i);
        }
    }
}
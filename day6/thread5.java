package day6;

public class thread5 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("My Thread :"+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }
}
class demo3{
    public static void main(String[] args) {
        thread5 obj=new thread5();
        obj.start();
    }
}
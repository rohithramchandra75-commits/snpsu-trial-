package day6;

class thread6 extends Thread{
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("My Thread :"+i);
        }
    }
}
class mmo{
     public static void main(String[] args) throws Exception {
        thread6 t1=new thread6();
        t1.start();

        t1.join();
        System.out.println("Main Thread :");
    }
}
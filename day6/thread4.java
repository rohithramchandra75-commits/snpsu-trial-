package day6;
class thread4 implements Runnable {
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("My Thread :"+i);
        }
    }
}
class demo{
    public static void main(String[] args) {
        thread4 t1 = new thread4();
        Thread t2 = new Thread(t1);
        t2.start();
        for (int i=0;i<=5;i++){
            System.out.println("main :"+i);

        }
    }
}
package assignments2;

class MyThread1 extends Thread {
    public void run() {
        System.out.println("Thread created using Thread class");
    }
}
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread created using Runnable interface");
    }
}

public class threadsrun {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r);
        t2.start();
    }
}
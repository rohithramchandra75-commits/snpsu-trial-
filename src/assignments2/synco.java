package assignments2;

class Counter {
    int count = 0;
    synchronized void increment() {
        count++;
    }
}
class MyThread extends Thread {
    Counter c;
    MyThread(Counter c) {
        this.c = c;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}

public class synco {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter.count);
    }
}

package assignments2;

class DeadlockDemo {

    public static void main(String[] args) {

        final Object resource1 = new Object();
        final Object resource2 = new Object();
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: Locked Resource 1");

                    try { Thread.sleep(100); }
                    catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1: Locked Resource 2");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: Locked Resource 2");

                    try { Thread.sleep(100); }
                    catch (Exception e) {}

                    synchronized (resource1) {
                        System.out.println("Thread 2: Locked Resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
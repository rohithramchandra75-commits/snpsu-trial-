package assignments2;

class LifeCycle extends Thread {

    public void run() {
        System.out.println("Thread is in Running state");
        try {
            Thread.sleep(1000); // Thread goes to Timed Waiting state
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread finished execution (Terminated state)");
    }

    public static void main(String[] args) {

        LifeCycle t1 = new LifeCycle();
        System.out.println("State after creation: " + t1.getState());
        t1.start();
        System.out.println("State after start(): " + t1.getState());

        try {
            Thread.sleep(100);
        } catch (Exception e) {}
        System.out.println("State during execution: " + t1.getState());
    }
}
package day7;
class Counter{
    int count=0;
    void increment(){
        count++;

    }
}
public class syncronized {
    static void main(String[] args) {
        Counter c= new Counter();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                c.increment();
            }
        });
        t1.start();
        t2.start();
        try {
        }catch(Exception e){}
        System.out.println("count="+c.count);
    }
}
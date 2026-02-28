package day6;

class thread7 extends Thread{
    Thread t;
    thread7(Thread t){
        this.t=t;
    }
    public void run(){
        try{
            if(t!=null){
                t.join();
            }
        }catch(Exception e){
            count++;
        }


    }
}

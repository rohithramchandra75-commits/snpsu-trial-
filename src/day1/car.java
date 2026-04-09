public class car {
    String brandname;
    int mandate;
    String color;

    public car(String bname, int mdate, String c) {
        brandname = bname;
        mandate = mdate;
        color = c;
    }
    void printdetail(){
        System.out.println("car brandname:"+brandname);
        System.out.println("car mandate:"+mandate);
        System.out.println("car color:"+color);
    }
}
class driver{
    public static void main(String[] args) {
        car c1=new car("Mike",1,"red");
        car c2=new car("bmw",2,"black");
        c1.printdetail();
        c2.printdetail();
    }
}

package day3;

public class encapsulation {
    private String name;
    private int usn;

    encapsulation(String name, int usn) {
        this.name = name;
        this.usn = usn;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getUsn() {
        return this.usn;
    }

    void setUsn(int usn) {
        this.usn = usn;
    }
    public void printdetials() {
    System.out.println("student id:" + this.usn);
    System.out.println("student name:" + this.name);
    }
}
class main2{
        public static void main(String[] args) {
            encapsulation shash=new encapsulation("Shash",1);
            shash.printdetials();
        }
    }



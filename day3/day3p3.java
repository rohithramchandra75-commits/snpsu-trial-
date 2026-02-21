package day3;

public class day3p3 {
        String name;
        int usn;
        day3p3(String name, int usn) {
            this.name = name;
            this.usn = usn;
        }
        //COPY CONSTRUCTOR
        day3p3(day3p3 s){
            this.name = s.name;
            this.usn = s.usn;
        }
        void display(){
            System.out.println(name+","+usn);
        }
    }
    class Drive {
        static void main(String[] args) {
            day3p3 s1 = new day3p3("vikas", 125);
            day3p3 s2 = new day3p3(s1);
            s1.display();
            s2.display();
        }
    }


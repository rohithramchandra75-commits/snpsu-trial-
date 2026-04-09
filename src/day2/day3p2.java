public class day3p2 {
    int id;
    String name;
        public day3p2(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void studentdetails() {
            System.out.println("student details");
            System.out.println("student id:" + id);
            System.out.println("student name:" + name);
        }
        public static void main(String[] args) {
            day3p2 rai =new day3p2(1, "Rai");
            day3p2 shash=new day3p2(2, "Shash");
            day3p2 guru=new day3p2(3, "Guru");
            rai.studentdetails();
            shash.studentdetails();
            guru.studentdetails();
        }
    }


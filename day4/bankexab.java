package day4;

abstract class Bank{
    String branch;
    Bank(String branch){
        this.branch = branch;
        System.out.println("Branch is: " + branch);
    }
    abstract void calculateinterests();
}
class sbi extends Bank{
    sbi(String branch){
        super(branch);
    }
    void calculateinterests(){
        System.out.println("Interests for " + branch);
    }
}
public class bankexab{
    public static void main(String[] args) {
        sbi sbi = new sbi("SBI");
        sbi.calculateinterests();
    }
}
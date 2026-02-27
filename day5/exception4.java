package day5;

public class exception4 {
    public static void main(String[] args) {
        try{
            int balance=2000;
            int withdraw=3000;
            if(balance>withdraw){
                throw new ArithmeticException("Insufficient balance");
            }
            System.out.println("balance is "+balance);
            System.out.println("withdraw succesfull");
        }catch(ArithmeticException e){
            System.out.println("exception is "+e.getMessage());
        }
    }
}

package day5;

public class exception3 {
    static void checkage(int age){
        if(age>=18){
            System.out.println("access granted");
        }else{
            throw new RuntimeException("access denied");
        }
    }
    public static void main(String[] args) {
        checkage(18);
        checkage(12);
    }
}

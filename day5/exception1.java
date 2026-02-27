package day5;

public class exception1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=2;
        try{
            k=i/j;
            int [] arr={1,2,3,4,5};
            System.out.println(arr[10]);
        }catch(ArithmeticException e){
            System.out.println("undefined");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
        }catch(Exception e){
            System.out.println("exception");
        }finally {
            System.out.println("finally");
        }
        System.out.println("hello");
    }static{
        System.out.println("static");
    }
}

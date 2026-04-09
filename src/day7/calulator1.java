package day7;
interface calculator1{
    int add(int a,int b);
}
public class calulator1{
    public static void main(String[] args) {
        calculator1 c=(a,b) -> a+b;
        System.out.println(c.add(1,2));
    }
}
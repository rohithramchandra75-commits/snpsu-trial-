package day7;

interface calci{
    int add(int a,int b);
}
public class calculator{
    public static void main(String[] args) {
        calci c = new calci() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };

    }
}
package day9;

public class sumofnatural {
    static int sum(int x){
        if(x==1){
            return 1;
        }
        return x+sum(x-1);
    }
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
            {
            System.out.println(sum(i));
            }
    }
}

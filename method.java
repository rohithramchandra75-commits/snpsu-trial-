public class method{
    static void swap(int a, int b){

        int temp=0;
            temp=a;
            a=b;
            b=temp;
            System.out.println("after swap a:"+a);
        System.out.println("after swap b:"+b);
        }

    static void main() {

        swap(10,15);
    }
    }

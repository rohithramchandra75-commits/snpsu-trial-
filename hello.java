import java.util.Scanner;
public class hello {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 1st number");
        int marks1 =sc.nextInt();
        System.out.println("marks of 1 "+marks1);
        System.out.println("Enter a2nd number");
        int marks2=sc.nextInt();

        System.out.println("marks of 2"+marks2);
        int marks3=sc.nextInt();
        System.out.println("Enter a 3rd number");
        System.out.println("marks of 3"+marks3);
        int total=marks1+marks2+marks3;
        float percentage =total/3;
        if(percentage>=75){
            System.out.println("a");
        }
        else if( percentage <=75 && percentage>=50){
            System.out.println("b");
        }
        else if(percentage <=50){
            System.out.println("c");
        }
    }
}

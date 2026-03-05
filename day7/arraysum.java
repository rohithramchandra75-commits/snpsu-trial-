package day7;

public class arraysum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] prefix= new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(prefix[j]);
        }
        for(int j=0;j<arr.length;j++){
        }
        int L=1;
        int R=2;
        int sum=0;
        sum= prefix[R-1]-prefix[L-1];
        System.out.println("sum="+sum);
    }
}

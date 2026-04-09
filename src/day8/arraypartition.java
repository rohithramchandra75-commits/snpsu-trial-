package day8;

public class arraypartition {
    public static void main(String[] args) {
        int [] arr={3,4,5,7,8,2,1,6};
        int L =0;
        int R=arr.length-1;
        while(L<R){
            while(arr[L]%2==0 && L<R){
                L++;
            }
            while(arr[R]%2!=0 && R>L){
                R--;
            }
            if(L<R){
                int temp=arr[L];
                arr[L]=arr[R];
                arr[R]=temp;
                L++;
                R--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

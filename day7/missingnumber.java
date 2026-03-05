package day7;

public class missingnumber {
    public static void main(String[] args) {
        int [] arr={2,3,4,5};
        int n=4;

        int totalsum=n+(n+1)/2;
        int actualsum =0;
        for(int i=0;i<n;i++) {
            actualsum=actualsum+arr[i];
            System.out.println(i+":"+actualsum);
        }
    }
}

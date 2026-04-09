package day8;

public class movezeros {
    public static void main(String[] args) {
        int [] arr= {0,1,0,2,12};
        int indes =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[indes]=arr[i];
                indes++;
            }
        }
        while(indes<arr.length){
            arr[indes]=0;
            indes++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

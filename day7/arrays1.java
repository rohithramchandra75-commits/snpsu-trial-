package day7;

public class arrays1 {
    public static void main(String[] args) {
        int [] arr={2,3,4,5};
        int target=6;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==target){
                    System.out.println(arr[i]);
                    System.out.println(target);
                    System.out.println(arr[j]);
                }
            }
        }
    }
}

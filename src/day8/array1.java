package day8;

import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
        int [] arr ={2,2,1,2,3,2,2};
       int candidate=arr [0];
       int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
            if(count==0){
                candidate=arr[i];
                count=1;
            }
        }
        System.out.println(candidate);
    }
}

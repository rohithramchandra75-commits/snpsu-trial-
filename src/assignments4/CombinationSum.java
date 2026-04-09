package Module9;

import java.util.*;

public class CombinationSum {

    static void solve(int index,int[] arr,int target,List<Integer> temp,List<List<Integer>> res){

        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index;i<arr.length;i++){

            if(arr[i] <= target){

                temp.add(arr[i]);

                solve(i,arr,target-arr[i],temp,res);

                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args){

        int[] arr={2,3,6,7};
        int target=7;

        List<List<Integer>> res=new ArrayList<>();

        solve(0,arr,target,new ArrayList<>(),res);

        System.out.println(res);
    }
}
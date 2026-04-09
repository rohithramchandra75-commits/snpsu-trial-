package Module9;

import java.util.*;

public class Permutations {

    static void permute(int[] nums,List<Integer> temp,List<List<Integer>> res,boolean[] used){

        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){

            if(used[i]) continue;

            used[i]=true;
            temp.add(nums[i]);

            permute(nums,temp,res,used);

            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }

    public static void main(String[] args){

        int[] nums={1,2,3};

        List<List<Integer>> res=new ArrayList<>();

        permute(nums,new ArrayList<>(),res,new boolean[nums.length]);

        System.out.println(res);
    }
}
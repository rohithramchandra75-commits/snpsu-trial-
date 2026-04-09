package Module9;


import java.util.*;

public class Subsets {

    static void solve(int index,int[] nums,List<Integer> temp,List<List<Integer>> res){

        if(index==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[index]);
        solve(index+1,nums,temp,res);

        temp.remove(temp.size()-1);
        solve(index+1,nums,temp,res);
    }

    public static void main(String[] args){

        int[] nums={1,2,3};

        List<List<Integer>> res=new ArrayList<>();

        solve(0,nums,new ArrayList<>(),res);

        System.out.println(res);
    }
}
package Module9;

import java.util.*;

public class GenerateParentheses {

    static void solve(int open,int close,String str,List<String> res){

        if(open==0 && close==0){
            res.add(str);
            return;
        }

        if(open>0)
            solve(open-1,close,str+"(",res);

        if(close>open)
            solve(open,close-1,str+")",res);
    }

    public static void main(String[] args){

        int n=3;

        List<String> res=new ArrayList<>();

        solve(n,n,"",res);

        System.out.println(res);
    }
}
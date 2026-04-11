package day15;

import java.util.Arrays;

class Reccursionmethods {

    static int fib(int x,int[] dp){
        //Base case
        if(x==0 || x==1){
            return x;
        }
        //step3
        if(dp[x]!= -1){
            return dp[x];
        }

        //step 2
        dp[x]=fib(x-1,dp)+ fib(x-2,dp);
        return dp[x];
    }

    static void main(String[] args) {
        int n = 10;
        //step 1
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println("Fibonacci of 10 numbers is :"+fib(n,dp));
    }
}
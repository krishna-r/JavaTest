package org.example.knapsack;

import java.util.Arrays;

public class knapsack{
    public  int[][] fillDpArray(int[][] dp){
        for (int[] i : dp) {
            Arrays.fill(i, -1);
        }
        return dp;
    }
   public static int memoization(int n,int w,int[] wt,int[] val){
        knapsack ks=new knapsack();
        int[][] dp = new int[n + 1][w + 1];
       ks.fillDpArray(ks.fillDpArray(dp));
      return memo(n,w,wt,val,dp);
   }
    public static int memo(int n,int w,int[] wt,int[] val, int[][] dp){
        if(dp[n][w]!=-1)
            return dp[n][w]
                    ;        if(w==0||n==0)
            return  dp[n][w]=0;
        if(wt[n-1]>w)
            return  dp[n][w]=memo(n-1,w,wt,val,dp);
        return dp[n][w]=Math.max(val[n-1]+memo(n-1,w-wt[n-1],wt,val,dp),memo(n-1,w,wt,val,dp));
    }

    public static int matrix(int[] wt,int[] val,int w, int n){
        int[][] t=new int[n+1][w+1];
        for (int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                if(i==0||j==0)
                    t[i][j]=0;
            }
        }
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=w ; j++) {
                if(wt[i-1]>j)
                    t[i][j]=t[i-1][j];
                if(wt[i-1]<=j)
                    t[i][j]=Math.max(val[i-1] + t[i-1][j - wt[i-1]], t[i-1][j]);
                //Math.max(val[n-1]+rec(n-1,w-wt[n-1],wt,val),rec(n-1,w,wt,val));
            }
        }
        return t[n][w];
    }

    public static int rec(int n,int w,int[] wt,int[] val){

        if(w==0||n==0)
            return  0;
        if(wt[n-1]>w)
            return  rec(n-1,w,wt,val);
        return Math.max(val[n-1]+rec(n-1,w-wt[n-1],wt,val),rec(n-1,w,wt,val));
    }






}

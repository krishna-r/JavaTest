package org.example.knapsack;

import java.util.Arrays;

public class countNumberOfSubsetsWithGivenSum {
    public  int ctn(int n,int sum,int[] arr){
        if(sum==0)
            return 1;
        if(n==0)
            return 0;
        if(sum<arr[n-1]) {
            return ctn(n - 1, sum, arr);
        }else {
            return  ctn(n - 1, sum - arr[n - 1], arr)+ctn(n - 1, sum, arr) ;
        }
    }
    public int ctnRec(int n,int sum,int[] arr){
        int[][] dp=new int[n+1][sum+1];
        for (int[] i:dp){
            Arrays.fill(i,0);
        }
        for (int i = 0; i <=n ; i++) {
            dp[i][0]=1;
        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=sum ; j++) {
                if(j<arr[i-1]) {
                    dp[i][j] = dp[i - 1][j];
                }
                else {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                }
            }
        }
        return dp[n][sum];
        }

}

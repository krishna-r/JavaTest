package org.example.knapsack;

public class SubsetSum {

    public  boolean subsetSumRecursive(int n,int sum,int[] arr){
        if(n==0)
            return false;
        if(sum==0)
            return true;
        if(arr[n-1]>sum)
            return subsetSumRecursive(n-1,sum,arr);
        return subsetSumRecursive(n-1,sum-arr[n-1],arr)||subsetSumRecursive(n-1,sum,arr);
    }

    public  boolean subsetSumMemo(int n,int sum,int[] arr,int[][] dp){
        if(dp[n][sum]!=-1){
            if(dp[n][sum]==1) {
                return true;
            }else return false;
        }

        if(n==0){
            dp[n][sum]=0;
            return false;
        }
        if(sum==0)
        {
            dp[n][sum]=1;
            return true;
        }


        if(arr[n-1]>sum){
            boolean temp= subsetSumMemo(n-1,sum,arr,dp);
            if(temp){
                dp[n][sum]=1;
            }else dp[n][sum]=0;
            return temp;
        }
        boolean temp2= subsetSumMemo(n-1,sum-arr[n-1],arr,dp)||subsetSumMemo(n-1,sum,arr,dp);
        if(temp2){
            dp[n][sum]=1;
        }else dp[n][sum]=0;
        return temp2;
    }
    public boolean sumsetSumIterative(int n,int sum,int[] arr){
        boolean[][] dp=new boolean[n+1][sum+1];
        for (int i=0;i<=n;i++){
            for (int j=0;j<=sum;j++){
                if(i==0)
                    dp[i][j]=false;
                if(j==0)
                    dp[i][j]=true;
            }
        }
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= sum; j++) {
                if(j<arr[i-1])
                    dp[i][j]=dp[i-1][j];
                 if(j>=arr[i-1])
                dp[i][j]= dp[i-1][j]||dp[i-1][j-arr[i-1]];
            }
        }
        return dp[n][sum];
        }

}

package org.example.knapsack;

public class EqualSumPartition {

    public  boolean equalSumPartition(int[] arr){
        int sum=0;
        for (int i:arr){
            sum=sum+i;
        }
        if(sum%2!=0)
            return false;
        return subSetSum(arr.length,sum/2,arr);
    }
    public static boolean subSetSum(int n,int sum,int[] arr){
        if(n==0)
            return false;
        if(sum==0)
            return true;
        if(sum<arr[n-1])
            return subSetSum(n-1,sum,arr);
        return subSetSum(n-1,sum,arr)||subSetSum(n-1,sum-arr[n-1],arr);

    }
}

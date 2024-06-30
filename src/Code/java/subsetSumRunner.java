import org.example.knapsack.SubsetSum;
import org.example.knapsack.knapsack;
import org.testng.annotations.Test;

import java.util.Arrays;

public class subsetSumRunner {
    @Test
    public static void runner(){

         int[] arr = {3, 34, 4, 12, 5, 2};


         int sum=9;
         int n = arr.length;
        int[][] dp=new int[100][100];
        for (int[] i: dp){
            Arrays.fill(i,-1);
        }

        SubsetSum ss=new SubsetSum();
        System.out.println(ss.subsetSumRecursive(n,sum,arr));
        System.out.println(ss.subsetSumMemo(n,sum,arr,dp));
        System.out.println(ss.sumsetSumIterative(n,sum,arr));




    }

}

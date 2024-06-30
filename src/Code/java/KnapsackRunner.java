import org.example.knapsack.knapsack;
import org.testng.annotations.Test;

public class KnapsackRunner {
    @Test
    public static void runner(){

         int[] wt = {1, 4, 9, 6};
         int[] val = {7, 96, 1, 45};
         int w = 10;
         int n = wt.length;
        knapsack ks=new knapsack();
        System.out.println(ks.matrix(wt, val, w, n));
        System.out.println(ks.rec(n,w,wt,val));
        System.out.println(ks.memoization(n,w,wt,val));
    }
}

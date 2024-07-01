import org.example.knapsack.countNumberOfSubsetsWithGivenSum;
import org.testng.annotations.Test;

public class CountNumberOfSubsetsWithGivenSumRunner {
    @Test
    public void Runner(){
        int[] arr={9, 7, 0, 3, 9, 8, 6, 5, 7, 6};
        int sum=31;
        int n=arr.length;
        countNumberOfSubsetsWithGivenSum CountNos=new countNumberOfSubsetsWithGivenSum();
       // System.out.println(CountNos.ctn(n,sum,arr));
        System.out.println(CountNos.ctnRec(n,sum,arr));
    }
}

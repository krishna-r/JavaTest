import org.example.knapsack.EqualSumPartition;
import org.testng.annotations.Test;

public class EqualSumPartitionRunner {

    @Test
    public void equalSumPartitionRunner(){
        int[] arr={1, 3, 5};
        EqualSumPartition esp=new EqualSumPartition();
        System.out.println(esp.equalSumPartition(arr));
    }
}

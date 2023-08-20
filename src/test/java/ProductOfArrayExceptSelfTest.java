import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void productOfArrayExceptSelfTest(){
        ProductOfArrayExceptSelf program = new ProductOfArrayExceptSelf();
        int[] input1 = {1,2,3,4};
        int[] input2 = {-1,1,0,-3,3};
        int[] exp1 = {24,12,8,6};
        int[] exp2 = {0,0,9,0,0};

        Assertions.assertArrayEquals(exp1, program.productExceptSelf(input1));
        Assertions.assertArrayEquals(exp2, program.productExceptSelf(input2));
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class TwoSummsTest {

    @Test
    public void twoSummsTest(){
        TwoSumms program = new TwoSumms();
        System.out.println(Arrays.toString(new int[]{0, 1}));
        System.out.println(Arrays.toString(program.twoSum(new int[]{2, 7, 11, 15}, 9)));
        Assertions.assertArrayEquals(new int[]{0, 1}, program.twoSum(new int[]{2,7,11,15}, 9));
        Assertions.assertArrayEquals(new int[]{1, 2}, program.twoSum(new int[]{3,2,4}, 6));
        Assertions.assertArrayEquals(new int[]{0, 1}, program.twoSum(new int[]{3,3}, 6));
    }
}

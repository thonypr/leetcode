import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MaxConsecutiveOnesTest {

    @Test
    public void maxConsecutiveOnesTest(){
        MaxConsecutiveOnes program = new MaxConsecutiveOnes();
//        int[] input1 = {1,1,0,1,1,1};
        int[] input2 = {1,0,1,1,0,1};
//        assertEquals(3, program.findMaxConsecutiveOnes(input1));
        assertEquals(2, program.findMaxConsecutiveOnes(input2));

    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TopKFrequentElementsTest {

    @Test
    public void topKFrequentElementsTest(){
        TopKFrequentElements program = new TopKFrequentElements();
        int[] ar = {1,1,1,2,2,3};
        int k = 2;
        int[] exp1 = {1,2};
        int[] ar2 = {1};
        int k2 = 1;
        int[] exp2 = {1};
        Assertions.assertEquals(exp1, program.topKFrequent(ar, k));
        Assertions.assertEquals(exp2, program.topKFrequent(ar2, k2));
    }
}

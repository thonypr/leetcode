import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContainsDuplicateTest {

    @Test
    public void containsDuplicateTest(){
        ContainsDuplicate program = new ContainsDuplicate();
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        int[] nums4 = {1,1,1,3,3,4,3,2,4,2,1,1,1,3,3,4,3,2,4,2};
        assertTrue(program.containsDuplicate(nums1));
        assertFalse(program.containsDuplicate(nums2));
        assertTrue(program.containsDuplicate(nums3));
        assertTrue(program.containsDuplicate(nums4));

    }
}

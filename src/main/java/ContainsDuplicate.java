import org.apache.groovy.util.Maps;

import java.util.*;

import static java.util.Arrays.asList;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i)) {
                return true;
            }
            else set.add(i);
        }
        return false;
    }
}

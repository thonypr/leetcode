import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GroupAnagramsTest {

    @Test
    public void validAnagramTest(){
        GroupAnagrams program = new GroupAnagrams();
        String[] test1 = new String[] {"eat","tea","tan","ate","nat","bat"};
        List<String> l1 = new ArrayList<>();
        l1.add("bat");
        List<String> l2 = new ArrayList<>();
        l2.add("nat");
        l2.add("tan");
        List<String> l3 = new ArrayList<>();
        l3.add("ate");
        l3.add("eat");
        l3.add("tea");
        List<List<String>> expected = new ArrayList<>();
        expected.add(l1);
        expected.add(l2);
        expected.add(l3);

        List<List<String>> actual = program.groupAnagrams(test1);

        Assertions.assertEquals(expected, actual);


        // [["bat"],["nat","tan"],["ate","eat","tea"]]
//        List<String[]> testData = new ArrayList<>();
//        testData.add(new String[]{"anagram", "nagaram", "true"});
//        testData.add(new String[]{"rat", "car", "false"});
//        for (String[] td : testData) {
//            System.out.println(td[0] + " <----> " + td[1]);
//            Assertions.assertEquals(Boolean.valueOf(td[2]), program.isAnagram(td[0], td[1]));
//        }
    }
}

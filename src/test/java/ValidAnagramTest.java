import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class ValidAnagramTest {

    @Test
    public void validAnagramTest(){
        ValidAnagram program = new ValidAnagram();
        List<String[]> testData = new ArrayList<>();
        testData.add(new String[]{"anagram", "nagaram", "true"});
        testData.add(new String[]{"rat", "car", "false"});
        for (String[] td : testData) {
            System.out.println(td[0] + " <----> " + td[1]);
            Assertions.assertEquals(Boolean.valueOf(td[2]), program.isAnagram(td[0], td[1]));
        }
    }
}

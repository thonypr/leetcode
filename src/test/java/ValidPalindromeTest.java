import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidPalindromeTest {

    @Test
    public void validPalindromeTest(){
        ValidPalindrome program = new ValidPalindrome();
        assertTrue(program.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(program.isPalindrome("race a car"));
        assertTrue(program.isPalindrome(" "));
    }
}
